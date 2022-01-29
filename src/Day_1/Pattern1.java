package Day_1;

public class Pattern1 {

	public static void main(String[] args) {
		// Pattern 1
		// *     1 
		// **    2
		// ***   3 
		// ****  4
		// ***** 5 
		int n = 5;
		int i = 1;
		while(i<=n) { //1
			for(int j = 1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			i++;
		}
		

	}

}
