package practice10;


public class PTra10_05 {

	/*
	 * 以下の仕様のクラスを作成してください（新しくJavaファイルを作成してください）
	 *
	 * クラス名
	 * 		Car
	 * フィールド
	 * 		serialNo		:	int型
	 * 		color			：	String型
	 * 		gasoline		：	int型
	 * メソッド
	 * 		戻り値(int)、メソッド名(run)、引数(なし)
	 * 			ガソリンを1消費して、ランダムな距離(1～15)進む（戻り値が進んだ距離）
	 * 			ガソリンが負の数になった場合（もう進めない）は-1を返します。
	 */

	public static void main(String[] args) {

		// Carクラスを作成後に着手してください
		// ★ Car型の変数carを宣言し、Carクラスのインスタンスを代入してください
		Car car;
		car = new Car();

		// ★ 変数carに格納されているインスタンスのserialNoフィールドに、10000を代入してください
		car.serialNo = 10000;
		// ★ 変数carに格納されているインスタンスのcolorフィールドに、"Red"を代入してください
		car.color = "Red";
		// ★ 変数carに格納されているインスタンスのgasolineフィールドに、50を代入してください
		car.gasoline = 50;
		// 目的地までの距離
		final int distance = 300; //ここで書き加えない限りかわらないよ

		/*
		 * ★ 変数carに格納されているインスタンスメソッドrunを使って、目的地まで進んでください
		 * ★ 先にガソリンがなくなった場合は、「目的地に到達できませんでした」を出力してください
		 * ★ 目的地についた時点で「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください
		 * ※n：runメソッドを実行した回数, xは残りのガソリンの数です
		 * ｎでgasを使う →gasを使えば減る 減ったgasはxとなる
		 */

		System.out.println("俺の車は" + car.serialNo + "の" + car.color +"だ。"); //せっかくなので。
		System.out.println("俺はこいつであるところまで疾走る！");

		int runresult = 0; //走行距離
		int runcount = 0 ; //ガソリン消費量

		while(true) {
//			car.run();
			int move = car.run();
			runresult += move; //moveするごとに走行距離を加算
			runcount++ ; 	//↑に加えガソリン消費量も１づつ加算
//			System.out.println(runresult);
//			int n = runcount;
//			int x = car.gasoline;

			if (move == -1) {      //ガス欠の場合に対する処理
				System.out.println("目的地に到達できませんでした");
				break;           //ガス欠なので動けない＝これ以上処理はできない
			}else if (runresult >= distance) { //runresultがdistanceについたら処理はおわり
				System.out.println("目的地にまで" + runcount +"時間かかりました。残りのガソリンは、" + car.gasoline + "リットルです");
				break;			//目的地についたのでこれで処理はおわり
			}
		}
	}
}
