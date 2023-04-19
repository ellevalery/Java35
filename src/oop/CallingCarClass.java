package oop;

import java.util.Scanner;

public class CallingCarClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter car's brand");
        String carBrand = scanner.nextLine();
        System.out.println("Please enter car's color");
        String carColor = scanner.nextLine();
        System.out.println("Please enter car's mx speed");
        int carMaxSpeed = scanner.nextInt();

        //Create new car class object
        Car car1 = new Car();

        //Set fields values with data that we got from user
        car1.setBrand(carBrand);
        car1.setColor(carColor);
        car1.setMaxSpeed(carMaxSpeed);

        car1.printCarInfo();

        //Get max speed
        System.out.println(car1.getMaxSpeed());

        if (car1.getMaxSpeed() >= 300){
            System.out.println("Sports car");
        }else {
            System.out.println("Regular car");
        }

    }
}
