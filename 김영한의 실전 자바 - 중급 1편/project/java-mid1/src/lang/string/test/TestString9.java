package lang.string.test;

public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@example.com";

        String[] split = email.split("@");
        String ID = split[0];
        String Domain = split[1];

        System.out.println("ID = " + ID);
        System.out.println("Domain = " + Domain);
    }
}
