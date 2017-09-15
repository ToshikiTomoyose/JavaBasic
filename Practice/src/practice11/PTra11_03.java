package practice11;
/*
 * PTra11_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra11_03 {

	/*
	 * ★ PTra11_03クラスに、クラスフィールドでint型のnumberを定義してください
	 */
		static int number;
	/*
	 * ★ PTra11_03クラスのコンストラクタを引数なしで定義してください
	 * ★ 処理は、クラスフィールドnumberに1を加算してください
	 */

	PTra11_03(){		//PTra11_03クラスのコンストラクタを定義
		number += 1; //numberに「１」づつ足していく
	}

	public static void main(String[] args) {	//staticでない場合はインスタンスを用いて使う
		// ★ sumメソッドを呼び出してください
		PTra11_03 pTra11_03 = new PTra11_03();		//PTra11_03クラスのコンストラクタに、sumインスタンスし、メソッド呼び出し
		pTra11_03.sum(5,3);		//sum括弧内のx,yに数字を代入（メソッド元でint型で定義済み）
	}

	public void sum(int x, int y) {
		System.out.println("sumメソッドを呼び出しました。" + x + "＋" + y + "＝" + (x + y));
		System.out.println("クラスフィールドnumber：" + number/* + ★ クラスフィールドnumberの出力をしてください */);

	}

}
