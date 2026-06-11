public class codingGuild {

    public static void main(String[] args) {

        // Ravi's Details
        String name = "Ravi";
        int age = 22;
        int rank = 5;
        double salary = 50000.0;
        float membershipFee = 1500.50f;

        // Annual Bonus (12% of salary)
        double bonus = salary * 0.12;

        // Type Casting double to int
        int bonusInt = (int) bonus;

        // Welcome Card
        System.out.println("=================================");
        System.out.println("      CODING GUILD WELCOME       ");
        System.out.println("=================================");
        System.out.println("Name           : " + name);
        System.out.println("Age            : " + age);
        System.out.println("Rank           : " + rank);
        System.out.println("Salary         : ₹" + salary);
        System.out.println("Membership Fee : ₹" + membershipFee);
        System.out.println("Annual Bonus   : ₹" + bonus);
        System.out.println("Bonus (int)    : ₹" + bonusInt);
        System.out.println("=================================");
        System.out.println("Welcome to the Coding Guild!");
        System.out.println("=================================");
    }
}