public class SelectionSort {
    int count=0;
    public void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex= i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                    count++;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }
        System.out.print(count+" Steps");
        System.out.println();
    }
    public static void main(String[] args) {
        SelectionSort sort = new SelectionSort();
        int[] arr = new int[]{10,3, 119, 90, 40, 4,12,1};
        sort.selectionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
