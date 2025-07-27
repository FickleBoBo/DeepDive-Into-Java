package lambda.lambda1;

public class SamMain {

    public static void main(String[] args) {
        SamInterface samInterface = () -> {
            System.out.println("sam");
        };

        // 컴파일 오류
//        NotSamInterface notSamInterface = () -> {
//            System.out.println("not sam");
//        };
    }
}
