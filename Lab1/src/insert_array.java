public class insert_array {

    public static void main(String[] args) {
        //TASK 2
// EXCERCISE 2 AND 3
        int[]array= new int[6];
        array[0]= 100;
        array[1]=200;
        array[2]=300;
        array[3]= 400;
        array[4]=500;
        array[array.length-1]=18;
//    int Value=250;
//       for(int i=array.length-1; i<2; i--){
//           array[i]=array[i-1];
//       }
//        array[2]= Value;

        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
