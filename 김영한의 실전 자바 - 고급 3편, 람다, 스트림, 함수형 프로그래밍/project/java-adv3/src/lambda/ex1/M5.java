package lambda.ex1;

import lambda.MyFunction;

public class M5 {

    static MyFunction getOperation(String operator) {
        if (operator.equals("add")) {
            return (a, b) -> a + b;
        } else if (operator.equals("sub")) {
            return (a, b) -> a - b;
        }
        return (a, b) -> 0;
    }

    public static void main(String[] args) {
        MyFunction add = getOperation("add");
        MyFunction sub = getOperation("sub");
        MyFunction xxx = getOperation("xxx");

        System.out.println("add.apply(1, 2) = " + add.apply(1, 2));
        System.out.println("sub.apply(1, 2) = " + sub.apply(1, 2));
        System.out.println("xxx.apply(1, 2) = " + xxx.apply(1, 2));
    }
}
