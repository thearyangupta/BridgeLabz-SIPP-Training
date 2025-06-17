int main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a positive integer less than 100: ");
    int number = scanner.nextInt();
    if (number > 0 && number < 100) {
        int counter = 1;
        while (counter < 100) {
            if (counter % number == 0) {
                System.out.println(counter);
            }
            counter++;
        }
    } else {
        System.out.println("Please enter a valid positive integer less than 100.");
    }
    scanner.close();
    return 0;
}