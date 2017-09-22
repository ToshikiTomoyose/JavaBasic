package practice14.common;

public class DBCourse implements Course {
	String[] Unitdb = {"DB基礎","SQL基礎","メソッド","正規化","SQL応用"};

	public String getCourseName() {
		return PREFIX + "DB基礎";
	}

	public String[] getCourseUnit() {
		return Unitdb;
	}
}
