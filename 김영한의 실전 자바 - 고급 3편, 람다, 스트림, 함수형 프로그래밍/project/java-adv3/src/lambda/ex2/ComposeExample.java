package lambda.ex2;

public class ComposeExample {

    public static MyTransformer compose(MyTransformer f1, MyTransformer f2) {
        return s -> f2.transform(f1.transform(s));
    }

    public static void main(String[] args) {
        MyTransformer toUpper = s -> s.toUpperCase();

        MyTransformer addDeco = s -> "**" + s + "**";

        MyTransformer composeFunc = compose(toUpper, addDeco);

        String result = composeFunc.transform("hello");
        System.out.println(result);
    }
}
