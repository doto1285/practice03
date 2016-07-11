package prob3;

public class Prob3 {
	
	public static void main(String args[]) {
		
		char[] array1 = reverse("Hello World");
		printCharArray(array1);
		
		char[] array2 = reverse("Java Programming!");
		printCharArray(array2);
		
	}
	
	public static char[] reverse(String str){
		/* 구현코드 */
		StringBuffer strBuffer= new StringBuffer(str);
		strBuffer.reverse();
		return strBuffer.toString().toCharArray();
	}
	
	public static void printCharArray(char[] array){
		/* 구현코드 */
		for(char c : array) {
			System.out.print(c);
		}
		System.out.println();
	}
}
