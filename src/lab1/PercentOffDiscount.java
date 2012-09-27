/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Kyle Guzikowski
 * @version 1.01
 * @since 9.20.12
 */
public class PercentOffDiscount implements DiscountStrategy{

    @Override
    public double getDiscount(double price) {
        return price *.15;
    }
    
    
}
