package basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int amountBooks = 0;
		int sellFlag = 0;
		int bookprice = 200;
		System.out.println("本を売却します。");

		do {
			System.out.println("売却する本の冊数を１つ増やしますか？");
			System.out.println("はい：０，いいえ：１>");
			String str = reader.readLine();
			sellFlag = Integer.parseInt(str);
			amountBooks++;

		} while (sellFlag == 0);

		System.out.println("売却する本の冊数は" + (amountBooks - 1) + "冊です。");
		System.out.println("売却した本の合計金額は" + (amountBooks - 1) * bookprice + "円です。");

	}

}
