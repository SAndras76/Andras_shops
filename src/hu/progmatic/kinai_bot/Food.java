package hu.progmatic.kinai_bot;

public class Food extends warehouse{

    public Food() {
        this.quantity = quantity;
        this.unitType = unitType;
        this.price = price;
    }



    public Food(double quantity, String unitType, int price) {
        //super(quantity, unitType, price);
        this(quantity, unitType, price);
        this.isLongLife = isLongLife;

    }
}
