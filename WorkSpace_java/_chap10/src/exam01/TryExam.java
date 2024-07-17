`package exam01;

public class TryExam {

	public static void main(String[] args) {
		try {
			String s1 = null;
//			System.out.println(s1.length()); // NullPointerException
			System.out.println(s1);

			int[] a = new int[2];
//		a[100] = 3;	// ArrayIndexOutOfBoundsException

//			String s2 = "20a";
			String s2 = "20";
			int age = 0;

			age = Integer.parseInt(s2); // NumberFormatException
			System.out.println(age + 1);

			ThrowsTest tt = new ThrowsTest();
//			tt.throwException();
			
			tt.human(3);

			
		} catch (Exception e) {
			System.out.println("오류발생");
			System.out.println(e);
			System.out.println("----------------");

			e.printStackTrace();

			System.out.println("----------------");
			System.out.println(e.getMessage());
		}

		System.out.println("완료");

	}

}
