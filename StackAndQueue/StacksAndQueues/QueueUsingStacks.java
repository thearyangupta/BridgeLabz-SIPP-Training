import java.util.Stack;

public class QueueUsingStacks{
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        if (empty()) throw new RuntimeException("Queue is empty");
        shiftStacks();
        return stack2.pop();
    }

    public int peek() {
        if (empty()) throw new RuntimeException("Queue is empty");
        shiftStacks();
        return stack2.peek();
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    private void shiftStacks() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }

    // Driver code
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.push(10);
        queue.push(20);
        queue.push(30);
        System.out.println("Front element: " + queue.peek());
        System.out.println("Removed element: " + queue.pop()); 
        System.out.println("Is queue empty ? " + queue.empty()); 
    }
}
