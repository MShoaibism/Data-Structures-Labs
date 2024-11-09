public class task4 {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            int wordCount = words.length;
            maxWords = Math.max(maxWords, wordCount);
        }
        return maxWords;
    }
    public static void main(String[] args) {
        String[] sentences = {
                "I Love cricket",
                "python is good",
                "Coding is fun for him"
        };
        task4 solution = new task4();
        int result = solution.mostWordsFound(sentences);
        System.out.println(result);
    }
}
