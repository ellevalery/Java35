package basics;

import java.util.Scanner;

public class StringExamples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");

        String name = scanner.nextLine().toUpperCase().trim();

        if (name.equals("BOB")){
            System.out.println("Your name is Bob");
        }else {
            System.out.println("Your name is not Bob");
        }
/*...*/

        //Combine string values
        String text1 = "This is ";
        String text2 = "new text ";

        String result = text1.concat(text2);
        System.out.println(result);
        System.out.println("In this sentence there are " + result.length() + " characters");

        //indexOf
        System.out.println(result.indexOf("is"));
        System.out.println(result.indexOf('x'));

        //Replace
        String greetings = "This is holiday time. \nHave a nice holiday";
        System.out.println(greetings.replaceAll("holiday", "Easter"));
        System.out.println(greetings.replaceFirst("holiday","Easter"));
        System.out.println(greetings.replaceAll("nice holiday", "nice Easter"));

        //Substring
        String introduction = "Hello there! My name is Bob and I'm 6";
        System.out.println(introduction.substring(6));
        System.out.println(introduction.substring(6,12));
        System.out.println(introduction.length());

        String bobsAge = introduction.substring(introduction.length()-2).trim();
        System.out.println("Bob is " + bobsAge + " years old");

        int bobsAgeInteger = Integer.parseInt(bobsAge);

        if(bobsAgeInteger >= 18){
            System.out.println("Adult");
        }else {
            System.out.println("Child");
        }

        //Wrapper class
        int temp1 = 36;
        Integer temp2 = 26;

        String intStrValue = "1";
        String floatStrValue = "2.0";
        String doubleStrValue = "2.5342323";
        String booleanStrValue = "true";
        String longStrValue = "12341342342353";
        String charStrValue = "c";

        int intValue = Integer.parseInt(intStrValue);
        float floatValue = Float.parseFloat(floatStrValue);
        double doubleValue = Double.parseDouble(doubleStrValue);
        boolean booleanValue = Boolean.parseBoolean(booleanStrValue);
        long longValue = Long.parseLong(longStrValue);
        char charValue = charStrValue.charAt(0);

    }
}
