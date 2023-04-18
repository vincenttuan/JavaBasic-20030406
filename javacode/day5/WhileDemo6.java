package day5;

public class WhileDemo6 {

	public static void main(String[] args) {
		
		int count = 3;
		while(count > 0) {
			//---------------------------
			int x = 0;
			while(x < 5) {
				System.out.print("@");
				x++;
			}
			System.out.println(); // 換行
			//---------------------------
			count--;
		}
		
	}

}