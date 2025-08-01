package lambda.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapExample {

    public static List<String> map(List<String> list, Function<String, String> function) {
        List<String> result = new ArrayList<>();
        for (String s : list) {
            result.add(function.apply(s));
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> words = List.of("hello", "java", "lambda");
        System.out.println("원본 리스트 = " + words);

        List<String> uppercaseList = map(words, str -> str.toUpperCase());
        System.out.println("대문자 변환 결과 = " + uppercaseList);

        List<String> decoList = map(words, str -> "***" + str + "***");
        System.out.println("특수문자 데코 결과 = " + decoList);
    }
}
