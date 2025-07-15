package org.example;

import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;
import model.constants.Colour;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100.0);
        Food redApples = new Apple(10, 50.0, Colour.RED);
        Food greenApples = new Apple(8, 60.0, Colour.GREEN);
        Food[] items = { meat, redApples, greenApples };
        ShoppingCart cart = new ShoppingCart(items);
        System.out.println("Общая сумма без скидки: " + cart.getTotalPriceWithoutDiscount() + " руб.");
        System.out.println("Общая сумма со скидкой: " + cart.getTotalPriceWithDiscount() + " руб.");
        System.out.println("Сумма вегетарианских продуктов без скидки: " + cart.getVegetarianPriceWithoutDiscount() + " руб.");
    }
}
