package at.dej.OO.calculator;

public class SinCalculator extends Calculator {

    public SinCalculator(int height, int weight, String color) {
        super(height, weight, color);
    }
    public double sin(double a){
        return Math.sin(a);
    }
    public double cos(double b){
        return Math.cos(b);
    }
}
