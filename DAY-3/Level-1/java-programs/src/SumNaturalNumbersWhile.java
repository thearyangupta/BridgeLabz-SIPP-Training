int main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a natural number: ");
    int n = scanner.nextInt();
    if (n > 0) {
        int sum = 0;
        int formulaSum = n * (n + 1) / 2;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("The sum of " + n + " natural numbers is " + sum);
        System.out.println("The formula sum is " + formulaSum);
        System.out.println("Both computations are " + (sum == formulaSum ? "correct." : "not correct."));
    } else {
        System.out.println(n + " is not a natural number.");
    }
}