import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] input = {5,4,3,2,1};
        int[] output = new int[input.length];

        for(int i=0; i<input.length; i++) {
            if (i == input.length - 1) {
                output[i] = input[i] * input[0];
            } else {
                output[i] = input[i] * input[i + 1];
            }
        }
        System.out.println(Arrays.toString(output));

        //other solutions 1:
    /*
    int lastPosition = input[input.length - 1] * input[0];
    for (int i = 0; i<input.length-1; i++){
        input[i] = input[i] * input[i+1]
     }
     input[input.length-1] = lastPosition;
     System.out.println(Arrays.toString(input));
     */

        System.out.println("Exercise 2");

        int[] numbers= {1,2,3,4,5};
        for(int i=0; i<numbers.length; i++) {
            output[i] = numbers[numbers.length - (1 + i)];
        }
        System.out.println(Arrays.toString(output));

    }



}


