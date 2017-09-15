package practice10;

public class User {

		int userId ;
		String userNm ;
		String usermail ;
		String password ;

		String acopen() {
			return this.userId + this.userNm + this.usermail +this.password;
	}
}
