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
		
		//�Է� �ޱ�
		String[] name = {"����","����","�̸�","�ٿ�"};
		int[] score = new int[name.length];
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<name.length; i++) {
			System.out.printf("%s�� ������ �Է��Ͻÿ� : ",name[i]);
			score[i] = scanner.nextInt();
		}
		
		for (int i = 0; i<name.length; i++) {
			System.out.printf("%s�� ����: %d\n", name[i], score[i]);
		}
		
		//�迭 ��� ���
		System.out.println(Arrays.toString(name));
		
		//�迭 ��� ���� -> who�� name�� ���� �ּҸ� ����Ű�� ����. ��Ҹ� �������� �� 
		String[] who = null;
		who = Arrays.copyOf(name, name.length);
		System.out.println(Arrays.toString(who));
		
	}
}
