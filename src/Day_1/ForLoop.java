package Day_1;

public class ForLoop {

	public static void main(String[] args) {
		// The For Loop is an entry controlled loop that provides a concise loop control. 
		// 1. Initialisation   int i = 0
		// 2. test condition   i<=10
		// 3. Inc/dec          i++ / i--
		//     Syntax:- 
		//  for(initialisation ; test condition; inc/dec)
		//  {
		//   statement ;
		//  }
		   
		// 1  2  3 4 5 6 7 8 9 10   // 11<=10
		for(int i=1;i<=10;i++) {
			int mul = 3*i;     
			System.out.println(3+" * " + i + " = " + mul); //3 * 1 = 3  
		}

	}

}
