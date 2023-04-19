package homeworks;

import java.util.Arrays;

public class HW13 {

    public static void main(String[] args) {
        int listOfNumbers[] = {15, 8, 4, 22, 11, 9, 7};
        System.out.println("Original array: " + Arrays.toString(listOfNumbers) + '\n');
        System.out.println("Maximum value for above array = " + max(listOfNumbers));
        System.out.println("Minimum value for the above array = " + min(listOfNumbers));

    }

    public static int max(int[] listOfNumbers) {
        int max = listOfNumbers[0];
        for (int i = 0; i < listOfNumbers.length; i++) {
            max = Math.max(max, listOfNumbers[i]);
        }
        return max;
    }

    public static int min(int[] listOfNumbers) {
        int min = listOfNumbers[0];
        for (int i = 0; i < listOfNumbers.length-1; i++) {
            min = Math.min(min, listOfNumbers[i]);
        }
        return min;
    }
}
