
package service;
import model.Food;
import model.Discountable;
public class ShoppingCart {
    private Food[] items;
    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalPriceWithoutDiscount() {
        double sum = 0;
        for (Food item : items) {
            sum += item.getTotalPrice();}
        return sum;}

    public double getTotalPriceWithDiscount() {
        double sum = 0;
        for (Food item : items) {
            double itemTotal = item.getTotalPrice();
            double discount = 0;
            if (item instanceof Discountable) {
                discount = ((Discountable) item).getDiscount();
            }
            sum += itemTotal * (1 - discount / 100);
        }
        return sum;
    }

    public double getVegetarianPriceWithoutDiscount() {
        double sum = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                sum += item.getTotalPrice();
            }
        }
        return sum;
    }
}
