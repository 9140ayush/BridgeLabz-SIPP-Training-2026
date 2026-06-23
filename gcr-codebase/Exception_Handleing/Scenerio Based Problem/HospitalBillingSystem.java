import java.util.*;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
public class HospitalBillingSystem {

    public static void processPayment(double billAmount, double payment)
            throws InsufficientFundsException {

        if (payment < billAmount) {
            throw new InsufficientFundsException("Payment failed: Insufficient funds!");
        }

        System.out.println("Payment Successful.");
        System.out.println("Balance Amount: " + (payment - billAmount));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] patientBills = {5000, 8000, 12000};

        try {
            System.out.print("Enter patient index: ");
            int index = Integer.parseInt(sc.nextLine());

            System.out.print("Enter number of items: ");
            int items = Integer.parseInt(sc.nextLine());

            int totalBill = patientBills[index];

            int averageCost = totalBill / items;

            System.out.println("Patient Bill = " + totalBill);
            System.out.println("Average Cost per Item = " + averageCost);

            System.out.print("Enter payment amount: ");
            double payment = Double.parseDouble(sc.nextLine());

            processPayment(totalBill, payment);

        } catch (ArithmeticException e) {
            System.out.println("Error: Number of items cannot be zero.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numeric input.");

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Hospital billing process completed.");
            sc.close();
        }
    }
}