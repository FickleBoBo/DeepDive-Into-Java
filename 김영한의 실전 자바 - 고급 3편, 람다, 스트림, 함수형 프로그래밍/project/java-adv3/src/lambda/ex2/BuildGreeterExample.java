package lambda.ex2;

public class BuildGreeterExample {

    public static StringFunction buildGreeter(String greeting) {
        return str -> greeting + ", " + str;
    }

    public static void main(String[] args) {
        StringFunction function = buildGreeter("Hello");
        System.out.println("function.apply(\"World\") = " + function.apply("World"));
    }
}
