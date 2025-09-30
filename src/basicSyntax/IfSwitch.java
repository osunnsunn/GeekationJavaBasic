package basicSyntax;

public class IfSwitch {

	public static void main(String[] args) {

		int num = 4;

		if (num % 3 == 0) {
			System.out.println("3の倍数です。");
		} else if (num % 2 == 0) {
			System.out.println("2の倍数です。");
		} else {
			System.out.println("どちらでもありません。");
		}
		
		String pref = "京都";
		
		if(pref == "北海") {
			System.out.println("北海道");
		} else if(pref == "東京") {
			System.out.println("東京都");
		} else if(pref == "京都") {
			System.out.println("京都府");
		} else {
			System.out.println("当てはまりません。");
		}

	}

}
