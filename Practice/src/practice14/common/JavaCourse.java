package practice14.common;

public class JavaCourse implements Course {

	String[] Unit = {"式と演算","制御構文","メソッド","配列","オブジェクト指向","継承","高度な継承"};

	public String getCourseName() {
		return PREFIX + "Javaコース";
	}

	public String[] getCourseUnit() {
		return Unit;
	}

}
