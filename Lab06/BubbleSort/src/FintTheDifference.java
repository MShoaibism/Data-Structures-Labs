public class FintTheDifference {
    public void fintTheDifference(String s,String t) {
        int[] count = new int[26];
        for (char c : t.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : s.toCharArray()) {
            count[c - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] == 1) {
                System.out.println((char) (i + 'a') + " " + count[i]);
            }
        }
    }
    public static void main(String[] args) {
        FintTheDifference f = new FintTheDifference();
        f.fintTheDifference("abcd", "abcde");

    }
}
