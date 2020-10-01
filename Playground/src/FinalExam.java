
public class FinalExam {

	public static void main(String[] args) {
		String one = "1";
		String two = one;
		String three = one;
		
		boolean bl;
		
		if(two.equals(three)) {
			bl = true;
			System.out.println(bl);
		} else {
			bl = false;
			System.out.println(bl);
		}
	
	}

}
