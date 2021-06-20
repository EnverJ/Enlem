package Java1;

import java.util.Scanner;

public class switchScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("\n please enter grade");
		String grade=input.nextLine().toUpperCase();
		switch(grade){
		case "A+":
		case "A":
			System.out.println("Grade A");
			break;
		case "B":
			System.out.println("Grade B");
			break;
		default:
			System.out.println("No grade");
			break;
		}
		

	}

}
