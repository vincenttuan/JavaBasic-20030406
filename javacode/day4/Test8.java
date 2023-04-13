package day4;

import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入身分證第二碼:");
		int code = scanner.nextInt();
		switch(code) {
			case 1:
				System.out.println("男");
				//break;
			case 2:
				System.out.println("女");
				//break;
			case 8:
				System.out.println("外來人口-男");	
				break;
			case 9:
				System.out.println("外來人口-女");
				break;
			default:
				System.out.println("輸入錯誤");	
		}

	}

}