package lab1;

import java.text.NumberFormat;

/**
 *
 * @author Kyle Guzikowski
 * @version 1.01
 * @since 9.20.12
 */
public class Startup {
    public static void main(String[] args) {
        Product[] products = {
            new BaseballHat("Brewers Baseball Hat", "BH100",19.95, new NoDiscount()),
            new LeatherBelt("Men's Leather Dress Belt", "LB201", 39.50, new PercentOffDiscount()),
            new Socks("Women's Cotton Socks (Large)", "WS45", 25.88, new PercentOffDiscount())
        };
        
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        for(Product p : products) {
            System.out.println(p.getPartNumber() + ", "
                    + p.getPartName() + ", Price: "
                    + nf.format(p.getPrice()) + ", Discount: "
                    + nf.format(p.getDiscountInDollars()));
        }
    }
}
