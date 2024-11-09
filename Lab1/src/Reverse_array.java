public class Reverse_array {
    public static int[] reverseArray(int[] arr) {
        int[] reversedArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - 1 - i];
        }

        return reversedArray;
    }

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};

        int[] reversed = reverseArray(originalArray);

        // Print reversed array
        System.out.print("Reversed Array: ");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
    }
}
