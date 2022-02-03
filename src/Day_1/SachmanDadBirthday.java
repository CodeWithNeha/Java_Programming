package Day_1;

import java.util.Scanner;

public class SachmanDadBirthday {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please Enter Your Name :- ");
		String name = scn.nextLine();
		if(name.equals("Harjinder Singh")) {
			System.out.println("Enter your BirthDay Date Only");
			int date = Integer.parseInt(scn.next());
			if(date==4) {
				System.out.println("Happy BirthDay Dad...........");
				System.out.println("#############################");
			}
			else {
				System.out.println("Please Enter the correct Date");
			}
		}
		else {
			System.out.println("Please Meet Next Year");
		}

	}

}
