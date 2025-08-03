package lambda.lambda5.mystream;

import lambda.lambda5.filter.GenericFilter;
import lambda.lambda5.map.GenericMapper;

import java.util.ArrayList;
import java.util.List;

public class Ex1_Number {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> directResult = direct(numbers);
        System.out.println("directResult = " + directResult);

        List<Integer> lambdaResult = lambda(numbers);
        System.out.println("lambdaResult = " + lambdaResult);
    }

    static List<Integer> direct(List<Integer> numbers) {
        List<Integer> directResult = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                directResult.add(number * 2);
            }
        }
        return directResult;
    }

    static List<Integer> lambda(List<Integer> numbers) {
        List<Integer> filtered = GenericFilter.filter(numbers, n -> n % 2 == 0);
        List<Integer> mapped = GenericMapper.map(filtered, n -> n * 2);
        return mapped;
    }
}
