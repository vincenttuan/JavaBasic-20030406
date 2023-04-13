package day4;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入考試成績:");
		int score = scanner.nextInt();
		// 判斷是否及格 ?
		boolean isPass = score >= 60;
		System.out.printf("考試成績:%d 及格判斷:%b\n", score, isPass);
	}


}