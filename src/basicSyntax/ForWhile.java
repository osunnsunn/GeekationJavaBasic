package basicSyntax;

public class ForWhile {

	public static void main(String[] args) {

		System.out.println("＜＝問題１＝＞");

		for (int i = 1; i <= 100; i++) {
			if (i % 15 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}

		System.out.println("＜＝問題２＝＞");

		String[] programs = { "Ruby", "Golang", "Java", "Python", "Typescript", "HTML", "Javascript" };

		for (String prog : programs) {
			if (prog.equals("Java")) {
				System.out.println("現在学習中の言語はJavaです。");
				continue;
			}
			if (prog.equals("HTML")) {
				System.out.println("HTMLはプログラミング言語ではありません。");
				break;
			}
			System.out.println(prog);

		}
	}

}
