import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do we have?");
        int n = in.nextInt();
        float sum = 0f;
        for (int i = 1; i <= n; i++) {
            System.out.print("Number " + i + " : ");
            sum += in.nextFloat();
        }
        System.out.println("Their average is " + sum/n);
    }
}
