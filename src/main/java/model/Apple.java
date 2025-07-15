
package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {
    private String colour;
    public Apple(int amount, double price, String colour) {
        super(amount, price);
        this.colour = colour;
        this.isVegetarian = true;
    }
    public String getColour() {
        return colour;
    }
    public double getDiscount() {
        if (Colour.RED.equalsIgnoreCase(colour)) {
            return Discount.red_apple_discount;
        }
        return 0;
    }
}
