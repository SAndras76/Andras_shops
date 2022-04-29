package hu.progmatic.kinai_bot;

public class warehouse {

    public static int foodCounter;

    protected double quantity;
    protected String unitType;
    protected boolean isLongLife;

    protected int price = 0;

    public warehouse() {

        foodCounter++;
    }

    public warehouse(double quantity, String unitType, int price) {
        this.quantity = quantity;
        this.unitType = unitType;
        this.price = price;
    }

    // konstruktor
    public warehouse(double quantity, String unitType, boolean isLongLife, int price) {
        this(quantity, unitType, price);
        this.isLongLife = isLongLife;
    }

    public static void printInfo() {

        System.out.println("info");
    }

    public double getQuantity() {

        return quantity;
    }

    public void setQuantity(double quantity) {

        this.quantity = quantity;
    }

    public String getUnitType() {

        return unitType;
    }

    public void setUnitType(String unitType) {

        this.unitType = unitType;
    }

    public boolean isLongLife() {

        return isLongLife;
    }

    public void setLongLife(boolean longLife) {

        isLongLife = longLife;
    }

    public int getPrice() {

        return price;
    }

    public void setPrice(int price) {

        this.price = price;
    }

}
