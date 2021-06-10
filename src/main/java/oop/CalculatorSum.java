package oop;

public class CalculatorSum {

    int sum(int number1, int number2){
        return number1 + number2;
    }

    public static void main(String[] args) {

        CalculatorSum calculatorSum = new CalculatorSum();

        int sumResult = calculatorSum.sum(2,2);

        System.out.println(sumResult);
    }
}
