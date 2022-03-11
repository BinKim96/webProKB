package com.lec.quiz;
import java.util.Scanner;

public class Quiz5 {
	 public static void main(String[] args) {
		 Scanner korean = new Scanner (System.in);
			System.out.println("국어 : ");
			int su = korean.nextInt();
		 Scanner english = new Scanner (System.in);
			System.out.println("영어 : ");
			int sa = english.nextInt();
		 Scanner math = new Scanner (System.in);
			System.out.println("수학 : ");
			int so = math.nextInt();
				
			int sum = su + sa + so;
			System.out.println("총점은" + sum + "입니다");
			
			double avr = (sum/3); 
			System.out.printf("평균은 %.2f입니다", avr);
			
	}
}
