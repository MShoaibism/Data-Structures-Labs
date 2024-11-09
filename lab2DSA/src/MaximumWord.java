public class MaximumWord {

    public static int maxWords(String[] sentences) {
        int maxWords = 0;
        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            maxWords = Math.max(maxWords, words.length); // math.max is used to find maximum from 2 variables
        }
        return maxWords;
    }
    public static void main(String[] args) {

        String[] sentences = { "Shoaib and Shahzaib do crypto", "I'm Fine thanks",
                "ok done"
        };
        int result = maxWords(sentences);
        System.out.println("The maximum number of words in a single sentence is: " + result);
    }
}