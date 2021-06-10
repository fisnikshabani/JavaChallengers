package oop;

public class UsingThisKeyword {

    String brand;
    String color;

    void setupCar(){
        this.brand = "Lamborghini";
        this.color = "red";
    }

    public static void main(String[] args) {

        UsingThisKeyword car = new UsingThisKeyword();

        car.setupCar();

        System.out.println(car.brand);
        System.out.println(car.color);
    }
}
