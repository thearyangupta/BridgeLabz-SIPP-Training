public class signcheck {
    static void check(int number) {
        if (number > 0)
            System.out.println("positive");
        else if (number < 0)
            System.out.println("negative");
        else
            System.out.println("zero");
    }
    public static void main(String[] args) {
        check(-4);
    }
}
