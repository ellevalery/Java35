package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HW10 {
    public static void main(String[] args) {
    int[] myArray = {155,26,3,41,5,6,20,7,8,9,10,11,12,33};
        System.out.println("Original array: " + Arrays.toString(myArray));

        for (int i = 0; i < myArray.length / 2; i++) {
            int temp = myArray[i];
            myArray[i] = myArray[myArray.length - i - 1];
            myArray[myArray.length - i - 1] = temp;
        }
        System.out.println("Reversed Array : " + Arrays.toString(myArray));
    }
}
