//Calculator using if conditions
import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Type a simple mathematical operation :");
            int num1 = in.nextInt();
            String op = in.next();
            int num2 = in.nextInt();
            int ans = -1;
            if (op.equals("+")) ans = num1 + num2;
            else if (op.equals("-")) ans = num1 - num2;
            else if (op.equals("*")) ans = num1 * num2;
            else if (op.equals("/")) ans = num1 / num2;
            System.out.println(num1 + op + num2 + " = " + ans);
            System.out.println("type x to stop and anything else to continue...");
            if (in.hasNext("x")) break;
        }
    }
}
