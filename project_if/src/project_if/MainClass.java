package project_if;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {	
		System.out.println("�����Է�: ");
		Scanner inputNum = new Scanner(System.in);
		
		int score = inputNum.nextInt();
		
		switch (score){
		case 100 :
			System.out.printf("�ٸ¾Ҵ�! %d ��",score);
			break;

		default:
			System.out.println("Ʋ���� �ִ�");
			break;
		}
	}
}
