import java.util.Scanner;
public class ConvertTime {
	public static void main(String[] args) {
		for(;;) {
			System.out.print("input number of seconds:");
			Scanner in = new Scanner(System.in);
			int s = in.nextInt();
			int h = s / 3600;
			int rh = s % 3600;
			int m = rh / 60;
			int rm = rh % 60;
			System.out.printf("%d hours, %d minutes, %d seconds", h, m, rm);
			System.out.println();
		}
	}
}
