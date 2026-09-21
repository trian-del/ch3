import java.util.Scanner;
import java.util.Random;
public class GuessMyNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int ans = r.nextInt(100) + 1;
        System.out.println("Guess a number between 1 and 100");
        int guess = s.nextInt();
        System.out.println("The number was " + ans);
        System.out.print("You were off by " + Math.abs(guess-ans));
    }
}