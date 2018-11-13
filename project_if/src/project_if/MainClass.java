package project_if;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {	
		System.out.println("점수입력: ");
		Scanner inputNum = new Scanner(System.in);
		
		int score = inputNum.nextInt();
		
		switch (score){
		case 100 :
			System.out.printf("다맞았다! %d 점",score);
			break;

		default:
			System.out.println("틀린게 있다");
			break;
		}
	}
}
