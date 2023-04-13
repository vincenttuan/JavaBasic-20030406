package day4;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// 計算 BMI, 
		// 判斷 "過輕" <= "正常" < "過胖""
		// 判斷 18 <= bmi < 23
		Scanner scanner = new Scanner(System.in);
		System.out.println("BMI 計算機");
		System.out.print("請輸入身高(cm):");
		double h = scanner.nextDouble();
		System.out.print("請輸入體重(kg):");
		double w = scanner.nextDouble();
		// 計算 bmi
		double bmi = w / Math.pow(h/100, 2);
		System.out.printf("bmi:%.2f\n", bmi);
		// 判斷 bmi
		if(bmi < 18) {
			System.out.println("過輕");
		} else if(bmi >= 23) {
			System.out.println("過胖");
		} else {
			System.out.println("正常");
		}
	}

}