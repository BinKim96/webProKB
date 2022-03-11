package com.lec.homework;

public class Ex {
	public static void main(String[] args) {
		int Korean = 90;
		int English = 80;
		int Math = 77;
		System.out.println("국어점수는\s" + Korean + "입니다");
		System.out.println("영어점수는\s" + English + "입니다");
		System.out.println("수학점수는\s" + Math + "입니다");

		int sum = Korean + English + Math;
		int aver = sum / 3;
		System.out.println("촣점은\s" + sum + "입니다");
		System.out.println("평균은\s" + (double)aver + "입니다");


	}

}
