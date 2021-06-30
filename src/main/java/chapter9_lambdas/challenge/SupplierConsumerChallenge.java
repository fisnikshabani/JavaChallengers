package chapter9_lambdas.challenge;

import java.util.function.Consumer;
import java.util.function.IntSupplier;

public class SupplierConsumerChallenge {

    static int value;

    public static void main(String[] args) {

        IntSupplier valueS = () -> value++;

        Consumer<Object> oneMoreValue = (Object test) -> value++;
        oneMoreValue.accept(2);

        System.out.println(value + " " + valueS.getAsInt());

    }
}
