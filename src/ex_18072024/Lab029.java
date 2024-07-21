package ex_18072024;

public class Lab029 {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45F;
        //int total_price = course+GST; // Implicti Narrowing - JVM
        int total_price = course+(int)GST; // Explit narrowing - REAL time - money loss
        float Total= course+GST;
        System.out.println(total_price);
        System.out.println(Total);



    }
}
