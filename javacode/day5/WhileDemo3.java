package day5;

import java.util.Random;

public class WhileDemo3 {

	public static void main(String[] args) {
		Random random = new Random();
		while(true) {
			int n = random.nextInt(100);
			// 若 n 是偶數則印出, 若 n 是奇數則不印出
			if(n % 2 == 1) {
				continue;
			}
			System.out.println(n);
			// 若 n == 0 則離開迴圈
			if(n == 0) {
				break;
			}
		}

	}

}