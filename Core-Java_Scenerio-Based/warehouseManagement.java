import java.util.*;

public class warehouseManagement {

    // Find Maximum Quantity
    public static int findMax(int[] stock) {
        int max = stock[0];
        for (int num : stock) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Find Minimum Quantity
    public static int findMin(int[] stock) {
        int min = stock[0];
        for (int num : stock) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Calculate Total Stock
    public static int totalStock(int[] stock) {
        int sum = 0;
        for (int num : stock) {
            sum += num;
        }
        return sum;
    }

    // Detect Duplicates
    public static void detectDuplicates(int[] stock) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : stock) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicate quantities found.");
        } else {
            System.out.println("Duplicate quantities: " + duplicates);
        }
    }

    // Rotate Array by K Positions
    public static void rotateArray(int[] stock, int k) {
        int n = stock.length;
        k = k % n;

        reverse(stock, 0, n - 1);
        reverse(stock, 0, k - 1);
        reverse(stock, k, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    // Transpose Matrix
    public static int[][] transposeMatrix(int[][] shelf) {
        int rows = shelf.length;
        int cols = shelf[0].length;

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = shelf[i][j];
            }
        }

        return transpose;
    }

    // Print Array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Print Matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Stock Array Input
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        int[] stock = new int[n];

        System.out.println("Enter stock quantities:");
        for (int i = 0; i < n; i++) {
            stock[i] = sc.nextInt();
        }

        System.out.println("\nMaximum Stock = " + findMax(stock));
        System.out.println("Minimum Stock = " + findMin(stock));
        System.out.println("Total Stock = " + totalStock(stock));

        detectDuplicates(stock);

        // Rotation
        System.out.print("\nEnter k for daily shift handover rotation: ");
        int k = sc.nextInt();

        rotateArray(stock, k);

        System.out.print("Rotated Stock Array: ");
        printArray(stock);

        // 2D Shelf Grid
        System.out.print("\nEnter rows of shelf grid: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns of shelf grid: ");
        int cols = sc.nextInt();

        int[][] shelf = new int[rows][cols];

        System.out.println("Enter shelf grid values:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                shelf[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nOriginal Shelf Grid:");
        printMatrix(shelf);

        int[][] transpose = transposeMatrix(shelf);

        System.out.println("\nTransposed Shelf Grid:");
        printMatrix(transpose);

        sc.close();
    }
}