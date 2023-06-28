package sample.cafekiosk.unit.beverage;

import sample.cafekiosk.unit.Beverage;

/**
 * Created by sskim
 */
public class Latte implements Beverage {
    @Override
    public String getName() {
        return "라뗴";
    }

    @Override
    public int getPrice() {
        return 4_500;
    }
}
