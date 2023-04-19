package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListInterfaceExample2 {
    public static void main(String[] args) {

        //Example1

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println("List 1 = " + list1);

        ArrayList<Integer> list2 = new ArrayList<>(list1);
        System.out.println("List 2 = " + list2);

        //Example2

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Test 1");
        arrayList.add("Test 2");
        arrayList.add("Test 3");

        //For loop
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        //for-each
        for (String str : arrayList) {
            System.out.println(str);
        }

        //Linked list
        LinkedList<String> car = new LinkedList<>();
        car.add("Audi");
        car.add("Opel");
        car.add("Toyota");
        System.out.println(car);

        //Last element
        System.out.println(car.get(car.size() - 1));
        System.out.println(car.getLast());

        //Create a new LinkedList object (Integer)
        // Populate the list with values from 1 to 100
        // Print all elements in the console

        LinkedList<Integer> list = new LinkedList<Integer>();

        // Populate the list with values from 1 to 100
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }

            System.out.print(list);


        }
    }
