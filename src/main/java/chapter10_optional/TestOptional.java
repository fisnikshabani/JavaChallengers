package chapter10_optional;

import java.util.Optional;

public class TestOptional {

    public static void main(String[] args) {

        Optional<String> emptyOpt = Optional.empty();
        System.out.println(emptyOpt);

        String s = "Secret info";
        System.out.println(Optional.of(s).isPresent());
    }
}
