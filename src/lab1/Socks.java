package lab1;

/**
 *
 * @author Kyle Guzikowski
 * @version 1.01
 * @since 9.20.12
 */
public class Socks extends Product {

    public Socks(DiscountStrategy ds) {
        this.setDs(ds);
    }

    public Socks(String partName, String partNumber, double price, DiscountStrategy ds) {
        this.setPartName(partName);
        this.setPartNumber(partNumber);
        this.setPrice(price);
        this.setDs(ds);
    }
    
}
