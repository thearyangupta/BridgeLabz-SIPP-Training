public class counterwhile {
    static void  Count(int counter) {
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
    }
    public static void main(String[] args) {
        Count(5);
    }
}
