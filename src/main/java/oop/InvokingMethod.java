package oop;

public class InvokingMethod {

    public static void main(String[] args) {
        InvokingMethod invokingMethod = new InvokingMethod();
        invokingMethod.accelerate();
    }

    void accelerate(){
        System.out.println("Accelerate!");
        this.turnLeft();
    }

    void turnLeft(){
        System.out.println("Turn left");
    }
}
