package oop;

public class CalculatorMultiplication {

    float multiply(float number1, float number2){
        return number1 * number2;
    }

    public static void main(String[] args) {

        CalculatorMultiplication calculatorMultiplication = new CalculatorMultiplication();

        float multiplicationResult = calculatorMultiplication.multiply(2.5f, 2.5f);

        System.out.println(multiplicationResult);
    }
}
