package com.lec.quiz;
import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		Scanner scannery = new Scanner (System.in);
		System.out.println("ù��° ���� �Է��ϼ���");
		int first = scanner.nextInt();
		System.out.println("�ι�° ���� �Է��ϼ���");
		int second = scannery.nextInt();
		String result = (first == second) ? "O" : "X";
		System.out.println(result);
		
		
		
		 
//		String result = su%2 ==0 ? "�Է��Ͻ� ���� ¦���Դϴ�" : "�Է��Ͻ� ���� Ȧ���Դϴ�";
//		System.out.println(result);
//		scanner.close();
	}

}
