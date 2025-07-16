package BrowserHistory;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

class BrowserHistory {
    private LinkedList<String> history = new LinkedList<>();
    private ListIterator<String> iterator = history.listIterator();
    private String current = null;

    public void visit(String url) {
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        iterator.add(url);
        current = url;
    }

    public String currentPage() {
        return current != null ? current : "No pages visited yet";
    }

    public String back() {
        if (iterator.hasPrevious()) {
            iterator.previous();
            if (iterator.hasPrevious()) {
                current = iterator.previous();
                iterator.next();
            } else {
                current = history.getFirst();
            }
        }
        return currentPage();
    }

    public String forward() {
        if (iterator.hasNext()) {
            current = iterator.next();
        }
        return currentPage();
    }
}

public class Main {
    public static void main(String[] args) {
        BrowserHistory history = new BrowserHistory();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Visit a new page");
            System.out.println("2. Go back");
            System.out.println("3. Go forward");
            System.out.println("4. See current page");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter URL to visit: ");
                    String newUrl = sc.nextLine();
                    history.visit(newUrl);
                    System.out.println("Visited: " + newUrl);
                    break;

                case "2":
                    String backPage = history.back();
                    System.out.println("Went back to: " + backPage);
                    break;

                case "3":
                    String forwardPage = history.forward();
                    System.out.println("Went forward to: " + forwardPage);
                    break;

                case "4":
                    System.out.println("Current page: " + history.currentPage());
                    break;

                case "5":
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}