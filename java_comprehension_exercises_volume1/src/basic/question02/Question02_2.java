package basic.question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第5章 入出力
 */

public class Question02_2 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("商品の名前と値段を入力してください。");
		System.out.println("名前>");
		String itemname = reader.readLine();

		System.out.println("値段>");
		String itemprice = reader.readLine();
		int price = Integer.parseInt(itemprice);

		System.out.println("商品の名前は" + itemname + "です。");
		System.out.println("商品の値段は" + price + "円です。");

	}
}
