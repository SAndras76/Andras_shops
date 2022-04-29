package hu.progmatic.kinai_bot;

public class toilet_paper extends nonFood {
    public boolean  isSoft;
    public toilet_paper(){
        super(1, "pack", 5, false);
    }




    public boolean isSoft() {
        return isSoft;
    }

    public int softPrice() {

        super(1, "pack", 5, true);
        price = price + 2;
        this.isSoft = isSoft;
        return price;
    }

    public toilet_paper(double quantity, String unitType, int price, boolean isSoft) {
        super(quantity, unitType, price, isSoft);}

}
