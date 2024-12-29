public class Buy {
    private double value;
    private String description;

    public Buy(double value, String description) {
        this.value = value;
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Buy: value=" + value +
                ", description='" + description;
    }
}
