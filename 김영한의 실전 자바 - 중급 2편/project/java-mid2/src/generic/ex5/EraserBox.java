package generic.ex5;

public class EraserBox<T> {

    public boolean instanceCheck(Object parma) {
//        return parma instanceof T;
        return false;
    }

    public void create() {
//        return new T();  // 오류
    }
}
