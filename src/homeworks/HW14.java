package homeworks;

import java.text.DecimalFormat;

public class HW14 {
    public static void main(String[] args) {

        discount(100,45);
        discount(89,20);
    }

    public static float discount (float price, float discount){
        DecimalFormat df = new DecimalFormat("0.00");
        discount /= 100;
        float result = price - (price * discount);
        System.out.println("Special price: " + df.format(result));
        System.out.printf("Special price: %.2f \n", result);
        return result;
    }
}
