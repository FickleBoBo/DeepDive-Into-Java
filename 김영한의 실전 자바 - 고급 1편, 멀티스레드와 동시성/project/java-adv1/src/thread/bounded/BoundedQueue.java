package thread.bounded;

public interface BoundedQueue {

    void put(String date);

    String take();
}
