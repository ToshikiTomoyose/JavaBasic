/*
 * PTra15_01.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice15.ptra15;

import practice15.common.Course;
import practice15.common.DBCourse;
import practice15.common.JavaCourse;

public class PTra15_01 {

	public static void main(String[] args) {


		JavaCourse jCourse = new JavaCourse();
		DBCourse dbCourse = new DBCourse(); //それぞれインスタンス化


		// ★ Course[	]の配列に jcourse と dbCourse のインスタンスを代入してください。
		Course[] courseList = new Course[2]; //Courseの配列型インスタンスを作成
		courseList[0] = jCourse; //それぞれの要素に↑のインスタンスを代入
		courseList[1] = dbCourse;

//		String[] jclst = jCourse.getCourseUnit();
//		for (int  i = 0 ; i < courseList.length; i++ ) {
//			courseList[i] = jCourse.getCourseUnit();
//		System.out.println(courseList[0]);
//		}

//		String[] dbclst = dbCourse.getCourseUnit();
//		for (int  j = 0 ; j < dbclst.length; j++ ) {
//
//		}

		for (Course course : courseList) {		//拡張for文を作りその中で・・・
			System.out.println(course.getCourseName());
//			course.getCourseUnit();
			String [] courcelist = course.getCourseUnit();

			for(String colst : courcelist) {
				System.out.println(colst);
			}

		}

	}

}
