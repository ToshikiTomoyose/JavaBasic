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
		Car car[] = new Car[3];  	//配列の中身mo宣言しないとぬるぽになるよ
		car[0] = new Car();
		car[1] = new Car();
		car[2] = new Car();

//		//クルマ0
		car[0].serialNo = 9610;
		car[0].color = "White";
		car[0].gasoline = 72;

//		//クルマ1
		car[1].serialNo = 58315;
		car[1].color = "Green";
		car[1].gasoline = 58;

//		//クルマ2
		car[2].serialNo = 21213;
		car[2].color = "Pink";
		car[2].gasoline = 63;

		//ゴール距離
		final int distance = 200;

		//走行距離・ガソリン
		//car0
		int runresult0 = 0;
		int runcount0 = 0 ;
		//car1
		int runresult1 = 0;
		int runcount1 = 0 ;
		//car2
		int runresult2 = 0;
		int runcount2 = 0 ;

//		System.out.println(car[0].serialNo + "の" + car[0].color +"！");
//		System.out.println(car[1].serialNo + "の" + car[1].color +"！");
//		System.out.println(car[2].serialNo + "の" + car[2].color +"！");

		//クルマ０の処理
		while(true) {
			int move = car[0].run();
			runresult0 += move;
			runcount0++ ;
//			System.out.println(runresult0);
			if (move == -1) {
				System.out.println("目的地に到達できませんでした");
				break;
			}else if (runresult0 >= distance) {
				break;
			}
		}

		//クルマ１の処理
		while(true) {
			int move = car[1].run();
			runresult1 += move;
			runcount1++ ;
//			System.out.println(runresult1);
			if (move == -1) {
				System.out.println("目的地に到達できませんでした");
				break;
			}else if (runresult1 >= distance) {
				break;
			}
		}

		//クルマ２のの処理
		while(true) {
			int move = car[2].run();
			runresult2 += move;
			runcount2++ ;
//			System.out.println(runresult2);
			if (move == -1) {
				System.out.println("目的地に到達できませんでした");
				break;
			}else if (runresult2 >= distance) {
				break;
			}
		}


		System.out.println(car[0].serialNo + "は目的地にまで" + runcount0 +"時間かかりました。残りのガソリンは、" + car[0].gasoline + "リットルです");
		System.out.println(car[1].serialNo + "は目的地にまで" + runcount1 +"時間かかりました。残りのガソリンは、" + car[1].gasoline + "リットルです");
		System.out.println(car[2].serialNo + "は目的地にまで" + runcount2 +"時間かかりました。残りのガソリンは、" + car[2].gasoline + "リットルです");
//		System.out.println("car0 " +runresult0);
//		System.out.println("car1 " +runresult1);
//		System.out.println("car2 " +runresult2);





	}


}