package static2;

public class DecoMain1 {

    public static void main(String[] args) {
        String s = "hello java";
        DecoUtil1 util1 = new DecoUtil1();
        String deco = util1.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
