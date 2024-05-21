import java.util.Arrays;
    
public class SelectionSort {

    public static void main(String[] args) {
        int[] input = {1,2,4,3,2,1,2,5,6,8,8,8,9,1,2,3};
        sorting(input);
        System.out.println(Arrays.toString(input));
    }
    public static void sorting(int[] inputArray){
        int lengthOfArray = inputArray.length;
        for(int y = 0; y < lengthOfArray; y++){
            int minimum = inputArray[y];
            int j = y;
            for(int i = y+1; i < lengthOfArray; i++){
                if(inputArray[i] < minimum){
                minimum = inputArray[i];
                j = i;
                }
            }
            inputArray[j] = inputArray[y];
            inputArray[y] = minimum;
         }
    
        }
    }