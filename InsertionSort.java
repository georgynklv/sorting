import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] input = {1,2,4,3,2,1,2,5,6,8,8,8,9,1,2,3};
        sorting2(input);
        System.out.println(Arrays.toString(input));
    }
    public static void sorting2(int[] inputArray){
        int lengthOfArray = inputArray.length;
        for(int j = 0; j < lengthOfArray; j++){
            for(int i = 0; i < lengthOfArray; i++){
                if(inputArray[j] < inputArray[i]){
                    int temporaryHolderOfElement = inputArray[j];
                    inputArray[j] = inputArray[i];
                    inputArray[i] = temporaryHolderOfElement;
                }
            }
        }
    }
}

