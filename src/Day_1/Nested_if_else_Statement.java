package Day_1;

public class Nested_if_else_Statement {

	public static void main(String[] args) {
		// Nested if..else Statement
		//  if(test-condition)
		//  {
		//      if(test-condition)
		//      {
		//    		statement-1;
		//		}
		//		else
		//      { 
		//         statement-2;
		//      }
		//   }
		//   else
		//   {
		//       if(test-condition)
		///       {
		//            statement-3;
		//		  }
		//       else
		//       {
		//          statement-4;
		//       }
		//    }
		int a = 90,b = 60,c=30;
		 if(a>b) {      //True
			 if(a>c) {   //True
				 System.out.println(a);  //90
			 }
			 else {
				 System.out.println(c);
			 }
		 }
		 else {
			 if(b>c) {
				 System.out.println(b);
			 }
			 else {
				 System.out.println(c);
			 }
		 }
	}

}
