package defaultmethod.ex1;

public class SMSNotifier implements Notifier {
    public void notify(String message) {
        System.out.println("[SMS] " + message);
    }
}
