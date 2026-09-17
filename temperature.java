import java.util.Scanner;
public class temperature {
	public static void main(String[] args) {
		for(;;) {
			Scanner s = new Scanner(System.in);
			System.out.print("Enter a temperature in Celsius:");
			double i = s.nextDouble();
			System.out.print(i+" C = ");
			System.out.printf("%.1f F", i*9/5+32);
			System.out.println();
		}
	}
}
