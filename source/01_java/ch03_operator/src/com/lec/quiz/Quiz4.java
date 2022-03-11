package com.lec.quiz;
import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("나이를 입력하세요 : ");
		int su = scanner.nextInt(); // 사용자로부터 정수 입력 받기
		String result = (su >= 65) ? "경로우대" : "일반";
		System.out.printf(result);
	
	}

}
