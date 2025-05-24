import java.util.Scanner;

//Calculating discount on a product
public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Total price : ");
        float price = in.nextFloat();
        System.out.print("Discount percentage : ");
        float per = in.nextFloat();
        float disc = per*price/100;
        System.out.println("You get a discount of $" + disc);
    }
}
