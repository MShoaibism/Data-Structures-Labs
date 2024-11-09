public class MergeTwoSortedArrays {
    public void mergeTwoSortedArrays(int[] arr1, int m, int[] arr2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[k--] = arr1[i--];
            } else {
                arr1[k--] = arr2[j--];
            }
            while (j >= 0) {
                arr1[k--] = arr2[j--];

            }
        }
        }
        public static void main (String[]args){
        MergeTwoSortedArrays obj = new MergeTwoSortedArrays();
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {4,5,6};
        obj.mergeTwoSortedArrays(arr1, 3, arr2, 3);
            for (int num : arr1) {
                System.out.print(num + " ");

        }}}