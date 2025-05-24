import java.util.Scanner;
import java.lang.Math;
public class Distance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Give x1 : ");
        float x1 = in.nextFloat();
        System.out.print("Give y1 : ");
        float y1 = in.nextFloat();
        System.out.print("Give x2 : ");
        float x2 = in.nextFloat();
        System.out.print("Give y2 : ");
        float y2 = in.nextFloat();
        float dist = (float) (Math.sqrt ( Math.pow (x1-x2,2) + Math.pow (y1-y2,2) ));
        System.out.println("The distance between these points is " + dist);
    }
}
