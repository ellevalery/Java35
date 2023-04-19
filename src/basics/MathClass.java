package basics;

public class MathClass {
    public static void main(String[] args) {
        float num = 5.6f;
        System.out.println(num);

        //Rounding down
        System.out.println("Floor: " + Math.floor(num));

        System.out.println(num);

        //Rounding up
        System.out.println("Ceil " + Math.ceil(num));

        //Rounding according to Math rule
        System.out.println("Round: " + Math.round(num));

        //ABS
        System.out.println("ABS: " + Math.abs(num));

        //Power
        System.out.println("Power " + Math.pow(2,3));

        //Max
        System.out.println("Max " + Math.max(num,1.2));

        //Min
        System.out.println("Min " + Math.min(num, 1.2f));

        //Max out of 3 values
        //10, 14, 19
        System.out.println("Max out of 3 " + Math.max(Math.max(14,19), 10));

        //SQRT
        System.out.println("SQRT: " + Math.sqrt(4));

        //Random
        System.out.println("Random " + Math.random());
        System.out.println("Random (0-9) " + (int) (Math.random() * 10));
        System.out.println("Random (0-10) " + (int) (Math.random() * 11));
        System.out.println("Random (1-10) " + (int) (Math.random() * 10) + 1);
    }
}
