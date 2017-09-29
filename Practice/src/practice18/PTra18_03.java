/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_03 {

	/*
	 * PTra18_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> playlist = new ArrayList<Player>();

        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
            	Player player = new Player();
                String line = scanner.nextLine();
                String[] lnstr = line.split(",",0);
                player.setPosition(lnstr[0]) ;
                player.setName(lnstr[1]);
                player.setCountry(lnstr[2]);
                player.setTeam(lnstr[3]);

                playlist.add(player);
            }

        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }

		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
        for (int j = playlist.size() -1 ; j > 0; j--) {
        	if (playlist.get(j).getTeam().equals("レアル・マドリード")) {
//        		System.out.println(playlist.get(j).getTeam());
        		playlist.remove(j);

        	}if (playlist.get(j).getTeam().equals("バルセロナ")) {
//        		System.out.println(playlist.get(j).getTeam());
        		playlist.remove(j);
        	}
        }

		// ★ 削除後のArrayListの中身を全件出力してください
        for (Player play : playlist) {
         	System.out.println(play.toString());

         }

	}
}
