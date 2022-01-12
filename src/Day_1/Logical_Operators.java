package Day_1;

public class Logical_Operators {

	public static void main(String[] args) {
		// Logical Operators :- Logical operators are used to compare two or more expressions. These operators also give 
		// single value as result, True or False
		// Logical-OR   ||       True || False   True 
		// Logical-AND  &&       True && False   False
		//
		// True || False || False || False    -> True
		// True && False && True  && True     -> False
		
		int a = 10;
		int b = 12;
		System.out.println((a>b)||(a==b));  // False
		System.out.println((a!=b)||(a>=b)); // True
		System.out.println((a!=b)&&(a<=b)); // True
		System.out.println((a!=b)&&(a==b)); // False
		System.out.println((a==b)&&(a>=b)); // False
		System.out.println(((a==b)&&(a>=b))||(a<b)); //true
		System.out.println(((a==b)&&(a>=b))&&(a<b)); //False
		
 
	}

}
