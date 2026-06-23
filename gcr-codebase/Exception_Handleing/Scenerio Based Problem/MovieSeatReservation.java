public class MovieSeatReservation {

    public static int getSeat(int index) {
        int[] seats = {101, 102, 103, 104, 105};

        try {
            return seats[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid seat position!");
            return -1;
        }
    }

    public static void main(String[] args) {

        int seat = getSeat(8);

        if (seat != -1) {
            System.out.println("Seat Number: " + seat);
        } else {
            System.out.println("Returned Value: -1");
        }
    }
}