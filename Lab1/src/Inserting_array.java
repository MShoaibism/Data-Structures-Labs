public class Inserting_array {
    public static void main(String[] args) {
//EXCERCISE 2(1ST)
        int[]Array={12,24,36,48,60};
        int newValue=6;
        int[]newArray= new int[Array.length+1];
        newArray[0]= newValue;

        for(int i=0; i<Array.length+1; i++){
        }
        for(int i=0; i<Array.length; i++){
            newArray[i+1]=Array[i];
        }
        for(int i=0; i<newArray.length; i++){
            System.out.println(newArray[i]);
        }
    }
}
