package collections;

import java.util.HashSet;

public class SetInterfaceExample {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();

        //Add elements
        names.add("Bob");
        names.add("Anna");
        names.add("Liam");
        names.add("Anna");

        //Print out all elements
        System.out.println(names);

        //Remove element
        names.remove("Bob");
        System.out.println(names);

        //Size
        System.out.println(names.size());

        //Contains
        System.out.println(names.contains("Liam"));
        System.out.println(names.contains("Bob"));

        //Iterate
        for(String str: names){
            System.out.println(str);

            //Example 2

            HashSet<Integer> intSet1 = new HashSet<>();
            intSet1.add(1);
            intSet1.add(2);
            intSet1.add(3);
            intSet1.add(4);

            System.out.println("intSet1 : " + intSet1);

            HashSet<Integer> intSet2 = new HashSet<>();
            intSet2.add(3);
            intSet2.add(4);
            intSet2.add(5);
            intSet2.add(6);

            System.out.println("intSet2 : " + intSet2);

            //Find union

            HashSet<Integer> union = new HashSet<>(intSet1);
            System.out.println("union before: " + union);
            union.addAll(intSet2);
            System.out.println("union after: " + union);
        }
    }
}
