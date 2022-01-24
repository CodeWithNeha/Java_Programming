package Day_1;

import java.util.Scanner;

public class The_else_if_ladder {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		if(n<0) {
			System.out.println("Negative");
		}
		else if(n>0) {
			System.out.println("Positive");
		}
		else
		{
			System.out.println("Zero");
		}

	}

}
