public class Searching_Array {
    public static void main(String[] args) {
                // EXCERCISE 1
        int[] array = {13, 26, 39, 52, 65};
        int index = 4;

        if (index >= 0 && index < array.length) {
            System.out.println("Element at index " + index + ": " + array[index]);
        } else {
            System.out.println("Index out of bounds");
        }
    }
}
// EXCERSISE 2
int[] array = {4, 6, 2, 8, 10};

int valueToFind = 8;

int index = linearSearch(array, valueToFind);

        if (index != -1) {
        System.out.println("Element " + valueToFind + " found at index: " + index);
        } else {
                System.out.println("Element " + valueToFind + " not found in the array.");
        }
                }
public static int linearSearch(int[] array, int value) {
    for (int i = 0; i < array.length; i++) {
        if (array[i] == value) {
            return i;
        }
    }
    return -1;

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is at mid
            if (arr[mid] == target) {
                return mid;  // Target found
            }

            // If target is greater, ignore the left half
            if (arr[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }
        return -1;  // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        int target = 33;

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}


}