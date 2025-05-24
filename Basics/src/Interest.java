import java.util.Scanner;
public class Interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Principal amount (INR) :");
        float p = in.nextFloat();
        System.out.println("Rate of interest (monthly) :");
        float r = in.nextFloat();
        System.out.println("Time (months) :");
        float t = in.nextFloat();
        double si = p*r*t/100;
        System.out.println("Your simple interest is " + si);
    }
}
