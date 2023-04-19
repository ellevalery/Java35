public class PrintFormatting {
    public static void main(String[] args) {
         // s - String
        // d - integer
        // f -float/double
        // c - char
        // b - boolean

        String name = "Bob";
        int age = 34;

        System.out.println("Hello " + name + " your age is " + age);
        System.out.printf("Hello %s your age %d\n",name,age);

        double height = 192.2342534d;
        System.out.printf("%s is %.2f cm tall",name,height);

        //Hello Bob tour age is 34 and your height is 192...... .Good job Bob!
        System.out.printf("Hello %1$s your age is %2$d and your height is %3$.2f cm. Good %1$s", name,age,height);
    }
}
