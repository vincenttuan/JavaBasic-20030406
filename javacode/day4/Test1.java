package day4;

public class Test1 {

	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = '\u0048';  // unicode 編碼 = 'H'
		char c3 = '中';
		char c4 = 65; // 會轉成 ASCII Code (65) = 'A'
		char c5 = 64; // @

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);

	}

}