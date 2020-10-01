package finalExam;

public class Question24 {

	public static void main(String[] args) {
		String one = "1";
		String two = new String(one);
		String three = new String(one);
		
		boolean bl;
		
		if(two == three) {
			bl = true;
			System.out.println(bl);
		} else {
			bl = false;
			System.out.println(bl);
		}

	}

}
