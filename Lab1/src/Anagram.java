import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        String word = "listen";
        String word2 = "silent";

        // Convert both strings to lowercase and then to character arrays
        char[] str = word.toLowerCase().toCharArray();
        char[] str2 = word2.toLowerCase().toCharArray();

        // Check if both arrays have the same length
        if (str.length == str2.length) {
            // Sort both character arrays
            Arrays.sort(str);
            Arrays.sort(str2);

            // Check if both sorted arrays are equal
            if (Arrays.equals(str, str2)) {
                System.out.println("It's an anagram");
            } else {
                System.out.println("It's not an anagram");
            }
        } else {
            System.out.println("It's not an anagram");
        }
    }
}
