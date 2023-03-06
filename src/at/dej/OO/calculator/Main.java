package at.dej.OO.calculator;

public class Main {
    public static void main(String[] args) {
        Calculator c1 = new Calculator(45, 55, "green");
        Calculator c2 = new Calculator(23,44,"yellow");
        double result = c1.add(4, 23);
        double result2 = c2.subtract(39,9);
        System.out.println("result :" + result);
        System.out.println("result :" + result2);

        SinCalculator sinC1 = new SinCalculator(43,45,"blue");
        double result3 = sinC1.sin(5);
        System.out.println("res :" + result3);

        RootCalculator root1 = new RootCalculator(43,45,"purple");
        double result4 = root1.sqrt(9);
        System.out.println("res :" + result4);
    }

}


