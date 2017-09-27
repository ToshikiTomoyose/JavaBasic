package practice16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 */
public class PTra16_01 {
    public static void main(String[] args) {

        /*
        * ★ java.util.Dateクラスを使って、自分の生年月日を「YYYY年MM月DD日」形式で出力してください
        *  ※　他の標準クラスも使って良いです
        */

    	try {
    		String mybirth = "1992年07月28日"; //Strin型でわしの誕生日を入力

    		SimpleDateFormat dayfoma = new SimpleDateFormat("yyyy年MM月dd日");	//SimpleDateFormatクラスdayfomaをインスタンス化し(フォーマットするため）上のString型を代入するための引数を入れる
    		Date bdate = dayfoma.parse(mybirth);	//Date型インスタンスbdateを作成し、dayfomaに代入するためそこでparthメソッド（parth文例外対策でcatch必須）を使いmybirthをDate型に変換
//    		System.out.println(bdate);		//これでDate型に代入できたが出力形式が違うので続く

    		SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日");		//今度は出力形式に合わせるため再びSimpleDateFormatクラスを用いｆを宣言し引数も入れる。
    		String mybithDStr = f.format(bdate); 	//String型mybithDStrを作りそこに上のDate型のbdateをmybithDStrに代入
        	System.out.println(mybithDStr);		//これでなんとか出力。String→Date→Stringはややこしい・・・　より効率的にできるようになりたい。・。。。

    	} catch(ParseException noe) {	//parse文の例外のcatch文
    		noe.printStackTrace();
    	}




    }
}