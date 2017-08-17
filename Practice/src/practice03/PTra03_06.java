package practice03;
/*
 * PTra03_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra03_06 {
	public static void main(String[] args) {

		int limitNumber = 100;

		//java.util.Scanner scanner = new java.util.Scanner(System.in);
		//System.out.println("テスト 入力してください。（数字のみ）");
		//String line = scanner.nextLine();

		// ランダムで数字を生成するプログラムです。
		// 下記の命令を実行すると変数randomに、0以上、変数limitNumber未満の数字がランダムで代入されます

		int random = new java.util.Random().nextInt(limitNumber + 1);

		//int random = Integer.parseInt(line);

		//---------------------ここから本題-----------------------
		/*
		 * ★ 以下の仕様に沿ってプログラムを完成させてください
		 *
		 * ●変数randomの値から、出力する値を変更します。
		 * ● 100の時			->	「☆☆☆☆☆」
		 * ● 30以下の時		->	「☆☆☆☆」
		 * ● 上記以外の場合	->	「☆☆☆」
		 *
		 * ※ プログラムは何行書いても良いです
		 */
		if(random == 100) {
			System.out.println("☆☆☆☆☆");
		} else if(random <= 30) {
			System.out.println("☆☆☆☆");
		} else if (random >31 && random <=99 ) {
			System.out.println("☆☆☆");
		} else {
			System.out.println("☆☆☆");
		}
	}
}
