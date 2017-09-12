import java.util.Scanner;

public class assignment02 {
	public static void main(String[] args) {
		String s1, s2, dms = null;
		int i, del;
		
		System.out.print("Give me a sentence : ");
		Scanner sentence = new Scanner(System.in);
		s1 = sentence.nextLine();
		
		System.out.print("Give me characters to delete : ");
		s2 = sentence.nextLine();
		del = s2.length();
		
		System.out.println("Original sentence : " + s1);
		
		dms = s1;
		for (i = 0; i < del; i++) {
			dms = dms.replace("" + s2.charAt(i), "");
		}
		
		System.out.println("Modified sentence : " + dms);
		
	}
}