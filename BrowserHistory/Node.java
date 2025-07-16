package BrowserHistory;

public class Node {
    String url;
    Node prev, next;

    public Node(String url) {
        this.url = url;
    }
}
