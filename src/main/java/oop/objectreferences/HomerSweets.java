package oop.objectreferences;

public class HomerSweets {

    public static void main(String[] args) {

        String[] homerSweets = {"Chocolate", "Cake", "Ice Cream"};
        changeFirstElementToPudding(homerSweets);
        System.out.println(homerSweets[0]);
    }

    static void changeFirstElementToPudding(String[] sweets){
      sweets[0] = "Pudding";
    }
}
