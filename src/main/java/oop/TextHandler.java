package oop;

public class TextHandler {

    String concatenate(String firstText, String secondText){
        return firstText + secondText;
    }

    public static void main(String[] args) {

        TextHandler th = new TextHandler();

        String concatenatedText = th.concatenate("Java", "Challengers");

        System.out.println(concatenatedText);
    }
}
