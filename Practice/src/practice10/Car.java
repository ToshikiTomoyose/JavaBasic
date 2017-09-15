package practice10;

import java.util.Random;

public class Car {

	int serialNo ;
	String color;
	int gasoline;

	int run() {			//ガソリンを1消費、ガス欠になったら-1を返す処理
		this.gasoline--;
		if (this.gasoline < 0) { //ガス欠になったら、↓
			return -1;			//-1を返す
		}

//		new Random().nextInt(15);
		int r = new Random().nextInt(15); //1から１５までランダムでクルマを走らせる
		r += 1;	 //←いれないと↑が０～１４に処理してしまう（0から数えるため）ので１を足す
		return r;   //これで１～１５のランダムの距離を走らせるやつ。
	}
}
