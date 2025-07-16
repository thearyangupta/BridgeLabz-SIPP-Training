package BrowserHistory;

public class BrowseHistory {
    private Node current;

    public void visit(String url) {
        Node newNode = new Node(url);
        if (current != null) {
            current.next = newNode;
            newNode.prev = current;
        }
        current = newNode;
        System.out.println("Visited: " + url);
    }

    public void back() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Went back to: " + current.url);
        } else {
            System.out.println("No previous page");
        }
    }

    public void forward() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Went forward to: " + current.url);
        } else {
            System.out.println("No forward page");
        }
    }

    public void currentPage() {
        if (current != null) {
            System.out.println("Current page: " + current.url);
        } else {
            System.out.println("No page loaded");
        }
    }
}
