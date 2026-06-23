import java.util.Scanner;
public class ThrowThrowsExample {
    public static double calculateInterest(double amount, double rate, int years)
            throws IllegalArgumentException {

        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Amount and rate must be positive");
        }

        // Calculate Simple Interest
        return (amount * rate * years) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Amount: ");
            double amount = sc.nextDouble();

            System.out.print("Enter Rate: ");
            double rate = sc.nextDouble();

            System.out.print("Enter Years: ");
            int years = sc.nextInt();

            double interest = calculateInterest(amount, rate, years);

            System.out.println("Calculated Interest = " + interest);

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: Amount and rate must be positive");
        }

        sc.close();
    }
}