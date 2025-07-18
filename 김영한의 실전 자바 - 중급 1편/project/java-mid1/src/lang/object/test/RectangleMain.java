package lang.object.test;

public class RectangleMain {

    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(100, 20);
        Rectangle rec2 = new Rectangle(100, 20);
        System.out.println(rec1);
        System.out.println(rec2);
        System.out.println(rec1 == rec2);
        System.out.println(rec1.equals(rec2));
    }
}
