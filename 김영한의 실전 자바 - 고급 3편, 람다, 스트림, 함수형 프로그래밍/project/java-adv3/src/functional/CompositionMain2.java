package functional;

import java.util.function.Function;

public class CompositionMain2 {

    public static void main(String[] args) {
        // 1. String -> Integer
        Function<String, Integer> parseInt = Integer::parseInt;

        // 2. Integer -> Integer
        Function<Integer, Integer> square = x -> x * x;

        // 3. Integer -> String
        Function<Integer, String> toString = x -> "결과: " + x;

        Function<String, String> finalFunc = parseInt
                .andThen(square)
                .andThen(toString);

        System.out.println("finalFunc = " + finalFunc.apply("5"));

        Function<String, Integer> stringToSquareFunc = parseInt.andThen(square);
        System.out.println("stringToSquareFunc = " + stringToSquareFunc.apply("5"));
    }
}
