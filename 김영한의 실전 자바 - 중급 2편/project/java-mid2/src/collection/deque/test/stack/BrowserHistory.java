package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    private Deque<String> history = new ArrayDeque<>();

    public void visitPage(String page) {
        System.out.println("방문: " + page);
        history.push(page);
    }

    public String goBack() {
        return history.pop();
    }
}
