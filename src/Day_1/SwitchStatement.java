package Day_1;

public class SwitchStatement {

	public static void main(String[] args) {
//		switch(expression){    
//		case value1:    
//		 //code to be executed;    
//		 break;  //optional  
//		case value2:    
//		 //code to be executed;    
//		 break;  //optional  
//		......    
//		    
//		default:     
//		  code to be executed if all cases are not matched;  
//		}    
		int marks = 50;
		switch(marks) {
		case 90:{
			System.out.println("A");
			break;
		}
		case 80:{
			System.out.println("B");
			break;
		}
		case 70:{
			System.out.println("C");
			break;
		}
		default:{
			System.out.println("D");
		}
		}
		
		
	}

}
