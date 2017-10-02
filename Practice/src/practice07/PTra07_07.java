package practice07;
/*
 * PTra07_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_07 {
	public static void main(String[] args) {

		// ★ ※2次元配列を用いています
//		int[] i  = new int[3];
//		int[] j = new int [4];


		int[][] array = {
				{500,40,6},
				{70,8,90,1000}
		};

//		System.out.println(array[0][0]);
//		System.out.println(array[1][0]);


		// ★ 配列arrayに格納されている全ての数字の平均を出力してください

		int index = 0;		//値数を算出するための変数
		double total = 0;	//配列の中身全体を出すための変数

		for (int i =0; i< array.length; i++) {		//int =iは[これ][]。 jは[][これ]
			for (int j =0; j <array[i].length; j++) {	//ｊはiと配列により連動。
				total += array[i][j];		//繰り返すごとに配列から合計値を加算
				index++;	//繰り返すごとに値数も加算
			}
		}

//		double num = array[0][0] + array[0][1] +array[0][2];    //doubleの場合
//		double sum = array[1][0] + array[1][1] +array[1][2] + array[1][3];
//
//		double mum = num + sum ;

//		int num = array[0][0] + array[0][1] +array[0][2];        numの場合
//		int sum = array[1][0] + array[1][1] +array[1][2] + array[1][3];

//		int mum = num + sum ;

		//System.out.println(mum);
		System.out.println("合計値" + total);
		System.out.println("値数" + index);
//		System.out.println(mum / (array[0].length + array[1].length));
		System.out.println("平均値：" + (total / index));
	}
}
