package Day_1;

public class WhileLoop {

	public static void main(String[] args) {
		// while loop 
		// 1. initialization
		// 2. test condition
		// 3. Inc/ Dec
		//   Syntax:-

		//  initialization   
		//  while(test condition)
		//  {
		//  Statement ;
		//  Inc/ Dec ;
		//  }
     
		int i=1;
		while(i<=10) {
			int mul = 3*i;
			System.out.println(3+" * " + i + " = " + mul);
			i++;
		}
		
	}

}
