package day4;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入身分證第二碼:");
		int code = scanner.nextInt();
		if(code == 1) {
			System.out.println("男");
		} else if(code == 2) {
			System.out.println("女");
		} else if(code == 8) {
			System.out.println("外來人口-男");
		} else if(code == 9) {
			System.out.println("外來人口-女");
		} else {
			System.out.println("輸入錯誤");
		}
	}
}