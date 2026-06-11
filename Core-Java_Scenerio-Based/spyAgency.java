import java.util.*;

public class spyAgency {

    // Reverse Message
    public static String reverseMessage(String msg) {
        return new StringBuilder(msg).reverse().toString();
    }

    // Palindrome Check
    public static boolean isPalindrome(String msg) {
        String clean = msg.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(clean).reverse().toString();
        return clean.equals(reversed);
    }

    // Count Vowels and Consonants
    public static void countVowelsConsonants(String msg) {
        int vowels = 0, consonants = 0;

        msg = msg.toLowerCase();

        for (int i = 0; i < msg.length(); i++) {
            char ch = msg.charAt(i);

            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    // Anagram Check
    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    // First Non-Repeating Character
    public static Character firstNonRepeating(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1)
                return entry.getKey();
        }

        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Secret Message
        System.out.print("Enter Secret Message: ");
        String message = sc.nextLine();

        // Reverse
        System.out.println("\nReversed Message: " + reverseMessage(message));

        // Palindrome
        if (isPalindrome(message))
            System.out.println("Message is a Palindrome.");
        else
            System.out.println("Message is NOT a Palindrome.");

        // Vowel & Consonant Count
        countVowelsConsonants(message);

        // Anagram Check
        System.out.print("\nEnter First Intercept Message: ");
        String intercept1 = sc.nextLine();

        System.out.print("Enter Second Intercept Message: ");
        String intercept2 = sc.nextLine();

        if (isAnagram(intercept1, intercept2))
            System.out.println("Intercepts are Anagrams.");
        else
            System.out.println("Intercepts are NOT Anagrams.");

        // First Non-Repeating Character
        System.out.print("\nEnter Surveillance Log: ");
        String log = sc.nextLine();

        Character result = firstNonRepeating(log);

        if (result != null)
            System.out.println("First Non-Repeating Character: " + result);
        else
            System.out.println("No Non-Repeating Character Found.");

        sc.close();
    }
}