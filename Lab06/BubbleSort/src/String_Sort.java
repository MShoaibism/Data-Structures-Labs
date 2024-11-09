public class String_Sort {
    public void sortInAscending (String[] Arr) {
        for (int i = 0; i < Arr.length - 1; i++) {
            for (int j = 0; j < Arr.length - i - 1; j++) {
                if (Arr[j].length()>(Arr[j + 1].length())) {
                    String temp = Arr[j];
                    Arr[j] = Arr[j + 1];
                    Arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        String_Sort sort = new String_Sort();
        String[] input = {"Shahzaib", "Cat", "Bilal"};
        sort.sortInAscending(input);
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }
}