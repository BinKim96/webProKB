package com.lec.quiz;
import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("���̸� �Է��ϼ��� : ");
		int su = scanner.nextInt(); // ����ڷκ��� ���� �Է� �ޱ�
		String result = (su >= 65) ? "��ο��" : "�Ϲ�";
		System.out.printf(result);
	
	}

}
