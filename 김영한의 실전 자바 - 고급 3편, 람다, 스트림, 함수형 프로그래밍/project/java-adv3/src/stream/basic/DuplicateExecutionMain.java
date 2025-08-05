package stream.basic;

import java.util.List;
import java.util.stream.Stream;

public class DuplicateExecutionMain {

    public static void main(String[] args) {
        // 스트림 중복 실행 확인
        Stream<Integer> stream = Stream.of(1, 2, 3);
        stream.forEach(s -> System.out.println(s)); // 1. 최초 실행

        // 오류 메시지 IllegalStateException: 스트림이 이미 작동했거나 닫혔습니다.
//        stream.forEach(s -> System.out.println(s));  // 2. 스트림 중복 실행 X

        // 대안: 대상 리스트를 스트림으로 새로 생성해서 사용
        List<Integer> list = List.of(1, 2, 3);
        Stream.of(list).forEach(System.out::println);
        Stream.of(list).forEach(System.out::println);
    }
}
