package Day_1;

import java.util.Scanner;

public class Assignment2_Even_Odd {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();        // 4%2  =  0   5%2 = 1  10%2=0  15%2=1
		if(num%2==0) {      //77%2 == 0
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is odd");
		}
	}

}
