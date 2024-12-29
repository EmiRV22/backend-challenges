import java.util.ArrayList;
import java.util.List;

public class CreditCard {

    private double limit;
    private double credit;

    private List<Buy> shoppingList;

    public CreditCard (double limit, double credit, List<Buy> shoppingList){
        this.limit = limit;
        this.credit = credit;
        this.shoppingList = new ArrayList<>();
    }

    public boolean sendBuy (Buy buy){
        if(this.credit > buy.getValue()){
            this.credit -= buy.getValue();
            this.shoppingList.add(buy);
            return true;
        }
        return false;

    }

    public double getLimit() {
        return limit;
    }

    public double getCredit() {
        return credit;
    }

    public List<Buy> getShoppingList() {
        return shoppingList;
    }
}
