package project_test;

import java.util.Arrays;
import java.util.Scanner;

public class Main_class {
	public static void main(String[] args) {
		int[] arr1 = new int[5];
		arr1[0] = 100;
		arr1[1] = 200;
		arr1[2] = 300;
		arr1[3] = 400;
		arr1[4] = 500;
		
		for (int i = 0; i< arr1.length; i++)
			System.out.printf("arr[%d] = %d\n", i, arr1[i] );
		
		//입력 받기
		String[] name = {"지원","지웅","미리","다원"};
		int[] score = new int[name.length];
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<name.length; i++) {
			System.out.printf("%s의 점수를 입력하시오 : ",name[i]);
			score[i] = scanner.nextInt();
		}
		
		for (int i = 0; i<name.length; i++) {
			System.out.printf("%s의 점수: %d\n", name[i], score[i]);
		}
		
		//배열 요소 출력
		System.out.println(Arrays.toString(name));
		
		//배열 요소 복사 -> who와 name은 같은 주소를 가리키진 않음. 요소만 복사했을 뿐 
		String[] who = null;
		who = Arrays.copyOf(name, name.length);
		System.out.println(Arrays.toString(who));
		
	}
}
