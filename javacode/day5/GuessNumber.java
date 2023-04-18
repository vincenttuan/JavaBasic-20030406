package day5;

import java.util.Scanner;
import java.util.Random;
public class GuessNumber {

	public static void main(String[] args) {
		Random random = new Random();
		int ans = random.nextInt(99)+1; // 1~99
		System.out.println(ans);
		int min = 0;
		int max = 100;
		do {
			// User 猜
			Scanner scanner = new Scanner(System.in);
			System.out.printf("請 User 在 %d ~ %d 之間猜一個數字:", min, max);
			int userGuess = scanner.nextInt();
			if(userGuess > ans) {
				max = userGuess;
			} else if(userGuess < ans) {
				min = userGuess;
			} else {
				System.out.println("Bingo User 猜對了");
				break;
			}

		} while(true);


	}

}