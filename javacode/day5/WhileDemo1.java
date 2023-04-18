package day5;

import java.util.Random;

public class WhileDemo1 {
	public static void main(String[] args) {
		Random random = new Random(); // 建立亂數(隨機數)物件
		while(true) {
			int n = random.nextInt(100); // 取得 0~99 之間的隨機數
			System.out.println(n);
		}
	}
}