package chapter9_lambdas;

import java.util.function.Consumer;

public class LambdaMutation {

    private int instanceNumber;

    private static int staticNumber;

    public static void main(String[] args) {
        Consumer<Integer> consumer = c -> System.out.println(++ new LambdaMutation().instanceNumber + ":" + ++staticNumber);
        consumer.accept(1);
    }
}
