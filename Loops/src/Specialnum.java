//Reads an integer "num" and generates all possible "special" numbers from 111 to 999
//such that num is fully divisible by each of the digits of the "special" numbers
import java.util.Scanner;
public class Specialnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = in.nextInt();
        for (int special = 111; special < 1000; special++) {
            int s = special;
            while (s > 0) {
                if (s % 10 == 0) {
                    s = s / 10;
                    continue;
                }
                if (num % (s % 10) != 0) {
                    s = -1;
                    break;
                } else {
                        s = s / 10;
                }
            }
            if (s != -1) System.out.print(special + " ");
        }
    }
}
