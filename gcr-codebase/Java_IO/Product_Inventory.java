import java.io.*;

public class Product_Inventory {
    public static void main(String[] args) throws Exception {

        BufferedReader br =
                new BufferedReader(new FileReader("inventory.txt"));

        String line;

        while ((line = br.readLine()) != null) {

            String[] arr = line.split("-");

            String product = arr[0];
            int quantity = Integer.parseInt(arr[1]);

            if (quantity == 0)
                System.out.println(product + " is out of stock");
        }

        br.close();
    }
}