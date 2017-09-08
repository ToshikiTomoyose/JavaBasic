package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {
		/*
		 * ★ carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 *
		 *
		 *
		 *
		 *
		 * ★ 各carインスタンスのrunメソッドを実行して、200km先の目的地に到達した順位を出力してください
		 */
		Car car0 = new Car();
		Car car1 = new Car();
		Car car2 = new Car();
		//クルマ0
		car0.serialNo = 9610;
		car0.color = "White";
		car0.gasoline = 72;
		//クルマ1
		car1.serialNo = 58315;
		car1.color = "Green";
		car1.gasoline = 58;
		//クルマ2
		car2.serialNo = 21213;
		car2.color = "Pink";
		car2.gasoline = 63;
		//ゴール距離
		final int distance = 200;
		//走行距離・ガソリン
		int runresult = 0;
		int runcount = 0 ;

//		System.out.println(car0.serialNo + "の" + car0.color +"！");
//		System.out.println(car1.serialNo + "の" + car1.color +"！");
//		System.out.println(car2.serialNo + "の" + car2.color +"！");

		//クルマ０の処理
		while(true) {
			int move = car0.run();
			runresult += move;
			runcount++ ;
//			System.out.println(runresult);
			if (move == -1) {
				System.out.println("目的地に到達できませんでした");
				break;
			}else if (runresult >= distance) {
				break;
			}
		}

		//クルマ１の処理
		while(true) {
			int move = car1.run();
			runresult += move;
			runcount++ ;
//			System.out.println(runresult);
			if (move == -1) {
				System.out.println("目的地に到達できませんでした");
				break;
			}else if (runresult >= distance) {
				break;
			}
		}

		//クルマ２のの処理
		while(true) {
			int move = car2.run();
			runresult += move;
			runcount++ ;
//			System.out.println(runresult);
			if (move == -1) {
				System.out.println("目的地に到達できませんでした");
				break;
			}else if (runresult >= distance) {
				break;
			}
		}
		System.out.println(car0.serialNo + "は目的地にまで" + runcount +"時間かかりました。残りのガソリンは、" + car0.gasoline + "リットルです");
		System.out.println(car1.serialNo + "は目的地にまで" + runcount +"時間かかりました。残りのガソリンは、" + car1.gasoline + "リットルです");
		System.out.println(car2.serialNo + "は目的地にまで" + runcount +"時間かかりました。残りのガソリンは、" + car2.gasoline + "リットルです");
	}
}