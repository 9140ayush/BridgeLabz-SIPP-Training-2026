import java.io.*;

public class Email_Domain {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
                new FileReader("emails.txt"));

        int gmail = 0, yahoo = 0;
        String email;

        while ((email = br.readLine()) != null) {

            String domain = email.substring(email.indexOf('@') + 1);

            if (domain.equals("gmail.com"))
                gmail++;
            else if (domain.equals("yahoo.com"))
                yahoo++;
        }

        br.close();

        System.out.println("Gmail users = " + gmail);
        System.out.println("Yahoo users = " + yahoo);
    }
}