import java.io.*;
import java.util.Scanner;

public class Employee_Skill {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee e = new Employee(id, name, dept, salary);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.dat"));
        oos.writeObject(e);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.dat"));

        Employee emp = (Employee) ois.readObject();

        System.out.println("\nRecovered Employee Information");
        System.out.println(emp.employeeId);
        System.out.println(emp.name);
        System.out.println(emp.department);
        System.out.println(emp.salary);

        ois.close();
    }
}