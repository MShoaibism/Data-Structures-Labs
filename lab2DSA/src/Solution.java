class Solution {
    public static int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] arr = new int[length * 2];

        for (int i = 0; i < length; i++) {
            arr[i] = nums[i];
            arr[i + length] = nums[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] input = {2, 3, 1};
       int[] res= getConcatenation(input);
       for (int i = 0; i < res.length; i++) {
           System.out.print(res[i]);
       }
        }
    }
