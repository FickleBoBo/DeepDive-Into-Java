package nested.nested.ex1;

public class Network {

    public void senMessage(String text) {
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }
}
