import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/convert")
public class ApiHandler extends HttpServlet {
    private final CurrencyConvert converter;
    private final Gson gson = new Gson();

    public ApiHandler(CurrencyConvert converter) {
        this.converter = converter;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        PrintWriter out = resp.getWriter();

        try {
            // Leer request
            BufferedReader reader = req.getReader();
            ConversionRequest request = gson.fromJson(reader, ConversionRequest.class);
            double result = converter.convert(request.getAmount(), request.getBaseCurrency(), request.getTargetCurrency());

            // Respuesta
            ConversionResponse response = new ConversionResponse(result);
            out.print(gson.toJson(response));
            resp.setStatus(HttpServletResponse.SC_OK);
        } catch (Exception e) {
            // Manejo de errores
            ErrorResponse errorResponse = new ErrorResponse(e.getMessage());
            out.print(gson.toJson(errorResponse));
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        } finally {
            out.flush();
        }
    }

    private static class ConversionRequest {
        private double amount;
        private String baseCurrency;
        private String targetCurrency;

        public double getAmount() { return amount; }
        public String getBaseCurrency() { return baseCurrency; }
        public String getTargetCurrency() { return targetCurrency; }
    }

    private static class ConversionResponse {
        private final double result;

        public ConversionResponse(double result) {
            this.result = result;
        }

        public double getResult() { return result; }
    }

    private static class ErrorResponse {
        private final String error;

        public ErrorResponse(String error) {
            this.error = error;
        }

        public String getError() { return error; }
    }
}
