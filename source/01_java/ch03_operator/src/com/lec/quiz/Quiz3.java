package com.lec.quiz;
import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		Scanner scannery = new Scanner (System.in);
		System.out.println("첫번째 수를 입력하세요");
		int first = scanner.nextInt();
		System.out.println("두번째 수를 입력하세요");
		int second = scannery.nextInt();
		String result = (first == second) ? "O" : "X";
		System.out.println(result);
		
		
		
		 
//		String result = su%2 ==0 ? "입력하신 수는 짝수입니다" : "입력하신 수는 홀수입니다";
//		System.out.println(result);
//		scanner.close();
	}

}
