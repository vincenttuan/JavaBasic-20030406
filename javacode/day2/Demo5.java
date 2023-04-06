package day2;

public class Demo5 {
	public static void main(String[] args) {
		int age = 10;
		int var = age++ - --age + age--;
		System.out.println("age = " + age);
		System.out.println("var = " + var);
	}
}