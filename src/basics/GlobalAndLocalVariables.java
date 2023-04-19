package basics;

public class GlobalAndLocalVariables {
    public static void main(String[] args) {
        int global = 10;
        System.out.println(global);

        if(10>5){
            System.out.println(global);
            int local = 15;
        }
        //System.out.println();
    }
}
