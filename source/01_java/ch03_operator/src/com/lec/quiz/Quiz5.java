package com.lec.quiz;
import java.util.Scanner;

public class Quiz5 {
	 public static void main(String[] args) {
		 Scanner korean = new Scanner (System.in);
			System.out.println("���� : ");
			int su = korean.nextInt();
		 Scanner english = new Scanner (System.in);
			System.out.println("���� : ");
			int sa = english.nextInt();
		 Scanner math = new Scanner (System.in);
			System.out.println("���� : ");
			int so = math.nextInt();
				
			int sum = su + sa + so;
			System.out.println("������" + sum + "�Դϴ�");
			
			double avr = (sum/3); 
			System.out.printf("����� %.2f�Դϴ�", avr);
			
	}
}
