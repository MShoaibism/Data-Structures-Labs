public class Del_array {
    public static void main(String[] args) {
        int[]array= new int[5];
        array[0]= 18;
        array[1]=16;
        array[2]=24;
        array[3]= 34;
        array[4]=40;
        for(int i=2; i<array.length-1; i++){
            array[i]=array[i+1];

        }
        array[array.length-1]=0;
        for(int i=0; i<array.length-1; i++){
            System.out.println(array[i]);
        }
    }
}
