import java.util.Scanner;

// Calculating electricity bill using rate slabs and units consumed
public class Bill {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Units of electricity consumed : ");
        int u = in.nextInt();
        int cost = -1;

        /* Units 0-99 $1/unit
         * Units 100-199 $3/unit
         * Units 200+ $5/unit
         */

        if (u<100) {
            cost = u;
        } else if (u<200) {
            cost = (u-100)*3 + 102; // First 99U of $1 + 1U of $3 = 102
        } else {
            cost = (u-200)*5 + 404; // First 99U of $1 + next 100U of $3 + 1U of $5 = 404
        }

        System.out.println("Your electricity bill is $" + cost);
    }
}
