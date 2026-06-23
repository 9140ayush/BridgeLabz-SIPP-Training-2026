import java.util.*;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class ATMWithdrawalSystem {

    static double balance = 5000;

    public static void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient Balance! Available Balance = ₹" + balance);
        }

        balance -= amount;
        System.out.println("Withdrawal Successful.");
        System.out.println("Remaining Balance = ₹" + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter withdrawal amount: ₹");
            double amount = sc.nextDouble();

            withdraw(amount);

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}