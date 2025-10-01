package basicSyntax;

public class GeekIntroduction {

	//メソッド１
	public static void greeting(int age, double height) {
		System.out.println("こんにちは! 私はGeek君でごわす。");
		System.out.println("年は" + age + "でごわす。");
		System.out.println("身長は" + height + "でごわす。");
	}

	//メソッド２
	public static void specialSkill(int num1, int num2) {

		if (num1 < 1 || num2 < 1) {
			System.out.println("num1とnum2は0より大きい値にしてください。");
			return;
		}

		if (num1 >= num2) {
			System.out.println("num2はnum1より大きい値にしてください。");
			return;
		}

		if (num1 > 300 || num2 > 300) {
			System.out.println("num1とnum2は300以下にしてください。");
			return;
		}

		for (int num3 = num1; num3 <= num2; num3++) {
			if (num3 % 15 == 0) {
				System.out.println(num3 + "は3の倍数かつ5の倍数です。");
				continue;
			} else if (num3 % 5 == 0) {
				System.out.println(num3 + "は5の倍数です。");
				continue;
			} else if (num3 % 3 == 0) {
				System.out.println(num3 + "は3の倍数です。");
				continue;
			}
			System.out.println(num3);
		}

	}

}