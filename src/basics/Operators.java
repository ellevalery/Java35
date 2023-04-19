package basics;

public class Operators {
    public static void main(String[] args) {

        //Basic arithmetic operators -. +, *, /, %
        int x = 100;
        x = x % 76;
        System.out.println(x);

        //Assignment operator =, -=, +=, *=, /=
        int a = 10;
        a = 20;
        a *= 20;
        System.out.println(a);

        //incrementation operators & decrementation operators ++, --

        int i = 10;
        i++;
        ++i;
        System.out.println(i);

        //relational operators

        //equality ==
        int p = 10;
        int k = 10;
        System.out.println("Equality " + (p==k));

        //Inequality !=
        System.out.println("Inequality " + (p!=k));

        //Greater than > and greater than or equal to >=
        System.out.println("Greater than " + (p>k));
        System.out.println("Greater than or equal to " +(p>=k));

        //Less than < and less than or equal to <=
        System.out.println("Less than " + (p<k));
        System.out.println("Less than or equal to " +(p<=k));

        //LOGICAL OPERATORS
        //Logical AND - &&

        boolean sun = true;
        boolean dry = true;

        System.out.println("I will go outside " + (sun && dry));

        //LOGICAL OR - ||

        boolean sale = false;
        boolean rich = false;

        System.out.println("I will buy iPhone " + (sale || rich));


    }
}
