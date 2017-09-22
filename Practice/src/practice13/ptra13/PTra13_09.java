/*
 * PTra13_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Employee;

public class PTra13_09 {

	/*
	 * ★ PTra13_08で作成したEmployeeクラスを使用します
	 */

	/** 名前データ（定数） */
	public static final String[] NAMEDATA = {"山田", "佐藤", "小林"};

	/** メールデータ（定数） */
	public static final String[] MAILDATA = {"yamada@hoge.com","satou@hoge.com","kobayashi@hoge.com"};

	/** パスワードデータ（定数） */
	public static final String[] PASSDATA = {"rezo0001","rezo0002","rezo0003"};

	/** 部署データ（定数） */
	public static final String[][] QUATERDATA = {
			{"総務部","業務部","システム部"},
			{"5","10","35"},
	};

	/**
	 * エントリーポイント
	 * @param args
	 */

	public static void main(String[] args) {

		// ★ 定数で定義されている各データを使用して、Employeeインスタンスを３つ作成してください

		Employee[] employee = new Employee[3];

		for (int  i = 0 ; i < NAMEDATA.length; i++ ) {
			employee[i] = new Employee();
			employee[i].setUserNm(NAMEDATA[i]);
//			System.out.println(employee[i].getUserNm());
		}

		for (int  i = 0 ; i < MAILDATA.length; i++ ) {
			employee[i].setMail(MAILDATA[i]);
//			System.out.println(employee[i].getMail());
		}

		for (int  i = 0 ; i < PASSDATA.length; i++ ) {
			employee[i].setPassword(PASSDATA[i]);
//			System.out.println(employee[i].getPassword());
		}

		for (int  i = 0 ; i < QUATERDATA[0].length; i++ ) {
			employee[i].setDepartmentNm(QUATERDATA[0][i]);
//			System.out.println(employee[i].getDepartmentNm());
		}

		for (int  i = 0 ; i < QUATERDATA[1].length; i++ ) {
			int j = Integer.parseInt(QUATERDATA[1][i]);
			employee[i].setDepartmentCnt(j);
//			System.out.println(employee[i].getDepartmentCnt());
		}

		for (int i = 0 ; i< employee.length; i++) {
			System.out.println(employee[i].userNm);
			System.out.println(employee[i].mail);
			System.out.println(employee[i].password);
			System.out.println(employee[i].getDepartmentNm());
			System.out.println(employee[i].getDepartmentCnt());
		}

	}
}
