public class OptimizedBBSort {
    int count=0;
    public void earlyStopBubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            boolean swap = false;
            for(int j=i+1; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    swap=true;
                    count++;
                }
            }
        }
        System.out.print(count+" Step");
        System.out.println();
    }
    public static void main(String[] args) {
        OptimizedBBSort ob = new OptimizedBBSort();
        int[] arr = {1,2,4,3,5};
        ob.earlyStopBubbleSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

