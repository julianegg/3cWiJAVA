package at.dej.OO.calculator;

public class Calculator {
    private int height, weight;
    private String color;

    public Calculator(int height, int weight, String color) {
        this.height = height;
        this.weight = weight;
        this.color = color;
    }

public double add(double a, double b){
        return a + b;
}
    public double subtract(double a, double b){
        return a - b;
    }



    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}