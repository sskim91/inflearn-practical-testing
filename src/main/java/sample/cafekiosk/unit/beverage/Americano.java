package sample.cafekiosk.unit.beverage;

import sample.cafekiosk.unit.Beverage;

/**
 * Created by sskim
 */
public class Americano implements Beverage {
    @Override
    public String getName() {
        return "아메리카노";
    }

    @Override
    public int getPrice() {
        return 4_000;
    }
}
