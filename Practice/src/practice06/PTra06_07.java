package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */
		for (int i = 0 ; i < 5 ; i++) {  //←列の数
			//System.out.print("□");

			for (int j = 0 ; j < i ; j++) { //←■の数 lnでなくprint
				System.out.print("■");
			}
			for (int k = 5 ; k > i ; k--) { //←■の数 lnでなくprint
				System.out.print("□");
			}
			System.out.println(); // 改行
		}
				for (int l = 5 ; l > 0 ; l--) {  //←lは５で、０より大きい限り、１つずつ減らしていく
				//System.out.print("□");

				for (int m = 0 ; m < l ; m++) { //←ｍは０で、ｍはｌより小さい限り、１つずつ増やしていく
						System.out.print("■");
					}
				for (int n = 5 ; n > l ; n--) { //←ｎは５。ｍはｌより大きい限り、ｎは１つずつ減らしていく
						System.out.print("□");
					}
				System.out.println(); // 改行
		}
	}
}
