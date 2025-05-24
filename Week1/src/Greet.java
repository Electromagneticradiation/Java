import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = input.next();
        System.out.printf("こんにちは %sちゃん!", name);
    }
}