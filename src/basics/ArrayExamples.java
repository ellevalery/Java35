package basics;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {

        //Declaring array that will store 3 elements of type String
        String[] names = new String[3];
        //Access value no. 1 from array
        System.out.println(names[0]);

        //Set element values using each element's index
        names[0] = "Ben";
        names[1] = "Tom";
        names[2] = "Bob";

        //Access value no. 1 from array
        System.out.println(names[2]);

        //Length
        System.out.println(names.length);

        //Second way - declare and initialize array at the same time
        String[] dreamCars = new String[]{"BMW", "Tesla", "Ferrari", "Opel"};

        //Length
        System.out.println(dreamCars.length);

        //Iterate through all elements in array with for loop

        for(int i = 0; i < dreamCars.length; i++){
            System.out.println((i+1) + ". " + dreamCars[i]);

        //Same idea but using For each loop
        for(String car : dreamCars){
            System.out.println(car);
        }

            System.out.println(Arrays.toString(dreamCars));

            //We have an array of some amount int values
            //We need to give a comment for every element in the array
            //If the values is odd or even

            int listOfNumbers[] = {234,5,45,23,65,33,1,64,2};

            //to loop through all elements let's use for-each loop
            for(int number : listOfNumbers){
                if(number % 2 == 0){
                    System.out.println(number + " even number");
                }else {
                    System.out.println(number + " odd number");
                }
            }

        }
    }
}
