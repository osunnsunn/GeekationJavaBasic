package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		int a = 6;
		int b = 2;
		result(addition(a, b));
		result(subtraction(a, b));
		result(multiplication(a, b));
		result(division(a, b));
	}

	public static int addition(int a, int b) {
		return a + b;
	}

	public static int subtraction(int a, int b) {
		return a - b;
	}

	public static int multiplication(int a, int b) {
		return a * b;
	}

	public static int division(int a, int b) {
		return a / b;
	}

	public static void result(int answer) {
		System.out.println("計算結果は" + answer + "です。");
	}
}