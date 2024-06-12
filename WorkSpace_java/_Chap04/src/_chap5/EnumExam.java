package _chap5;

public enum EnumExam {

	public static void main(String[] args) {
		
		
		
		
		System.out.println(LoginResult.SUCCESS);
		System.out.println(LoginResult.FAIL);
		
		LoginResult login;
		login = LoginResult.SUCCESS;
		
//		login에 어떤 값을 넣었는지 모를 때
		if( login == LoginResult.SUCCESS ) {
			System.out.println("성공");
		} else if (login == LoginResult.FAIL ) {
			System.out.println("실패");
		}
	}
}
