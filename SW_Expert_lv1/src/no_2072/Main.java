package no_2072;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int i = 1; i < (T+1); ++i) {
			int result = 0;
			int arr[] = new int[10];

			for (int j = 0; j < 10; j++) {
				arr[j] = sc.nextInt();
				if (arr[j] % 2 == 1)
					result += arr[j];
			}
			System.out.println("#" + i + " " + result);
		}
		sc.close();
	}
}
