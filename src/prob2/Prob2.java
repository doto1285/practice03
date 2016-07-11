package prob2;

import java.util.Scanner;

public class Prob2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] unit = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 1 };
		int input = scanner.nextInt();
		for (int i = 0; i < unit.length; i++) {
			System.out.println(unit[i] + "원 : " + input / unit[i] + "개");
			input %= unit[i];
		}
		scanner.close();
	}
}
