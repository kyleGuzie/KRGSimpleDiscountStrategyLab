package lab1;

/**
 *
 * @author Kyle Guzikowski
 * @version 1.01
 * @since 9.20.12
 */
public class LeatherBelt extends Product {

    public LeatherBelt() {
    }

    public LeatherBelt(String partName, String partNumber, double price, DiscountStrategy discount) {
        this.setPartName(partName);
        this.setPartNumber(partNumber);
        this.setPrice(price);
        setDs(discount);
    }
    
    @Override
    public double getDiscountInDollars() {
        return this.getPrice() * .15;
    }

}
