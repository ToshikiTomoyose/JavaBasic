/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

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
                player.setPosition(lnstr[0]);
                player.setName(lnstr[1]);
                player.setCountry(lnstr[2]);
                player.setTeam(lnstr[3]);

                playlist.add(player);
                Collections.shuffle(playlist);		//シャッフル化
            }
//	        for (Player play : playlist) {
//            	System.out.println(play.toString());
//	        }

        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください

//        System.out.println(playlist.get(4));
//        System.out.println(playlist.get(4));
        int playergk = 0;
        int playerdf = 0 ;
        int playermf = 0;
        int playerfw =0;



        for (int i = 0; i < playlist.size(); i++) {

        	if (playlist.get(i).getPosition().equals("GK")) {
    			playergk ++;
	        	if (playergk <= 1) {
	        		System.out.println(playlist.get(i).toString());
	        	}
        	}

        	if (playlist.get(i).getPosition().equals("DF")) {
    			playerdf ++;
	        	if (playerdf <= 4) {
	        		System.out.println(playlist.get(i).toString());
	        	}
        	}
        	if (playlist.get(i).getPosition().equals("MF")) {
    			playermf ++;
	        	if (playermf <= 4) {
	        		System.out.println(playlist.get(i).toString());
	        	}
        	}
        	if (playlist.get(i).getPosition().equals("FW")) {
    			playerfw ++;
	        	if (playerfw <= 2) {
	        		System.out.println(playlist.get(i).toString());

	        	}
        	}
        }
	}
}
