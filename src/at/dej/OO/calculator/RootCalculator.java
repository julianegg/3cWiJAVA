package at.dej.OO.calculator;

public class RootCalculator extends Calculator{

    public RootCalculator(int height, int weight, String color) {
        super(height, weight, color);
    }
    public double sqrt(double a){
        return Math.sqrt(a);
    }
}
