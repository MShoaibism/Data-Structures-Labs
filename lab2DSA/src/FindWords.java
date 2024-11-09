public class FindWords {
    public static int[] findWordIndices(String[] words, char x) {

        int[] indices = new int[words.length]; // index store krn ka variable
     int count = 0;


 for (int i = 0; i < words.length; i++) { // i itterates through entire array length
            String word = words[i];


 for (int j = 0; j < word.length(); j++) {
 if (word.charAt(j) == x) {
 indices[count] = i;
  count++;
   break;
    }
  }
  }
 int[] result = new int[count];
 for (int i = 0; i < count; i++) {
     result[i] = indices[i];
 }

 return result;
    }
    public static void printArray(int[] array) {
        if (array.length == 0) {
  System.out.println("[]");
  } else {
  System.out.print("[");
  for (int i = 0; i < array.length; i++) {
  if (i > 0) {
   System.out.print(", ");
   }
  System.out.print(array[i]);
 }
  System.out.println("]");
  }
  }
 public static void main(String[] args) {
 // Example inputs
 String[] words1 = {"Sweet", "cute"};
 char x1 = 'e';
 int[] result1 = findWordIndices(words1, x1);
 System.out.println("The character is present on index ");
 printArray(result1);
 String[] words2 = {"abc", "bcd", "aaaa", "cbc"};
 char x2 = 'a';
  int[] result2 = findWordIndices(words2, x2);
  System.out.println("The character is present on index ");
 printArray(result2);

 String[] words3 = {"google", "Aror", "Sukkur", "Alif Kacho"};
  char x3 = 'z';
 int[] result3 = findWordIndices(words3, x3);
 System.out.println("The character is present on index ");
  printArray(result3); // Output: []
  }}