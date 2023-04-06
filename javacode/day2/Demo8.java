package day2;

public class Demo8 {

	public static void main(String[] args) {
		// 計算 BMI 指數
		// 正常範圍 18 < bmi <= 23
		double h = 170; // 單位 cm
		double w = 60.0; // 單位 kg
		// 先把身高轉換為公尺
		// h = h / 100;
		h /= 100;
		double bmi = w / (h*h);
		System.out.println("bmi = " + bmi);
		System.out.printf("bmi = %.1f\n", bmi);
		System.out.printf("身高: %.1f cm\n體重: %5.1f kg\n指數: %5.1f\n", h*100, w, bmi);

		System.out.print(18 < bmi && bmi <= 23);
	}

}