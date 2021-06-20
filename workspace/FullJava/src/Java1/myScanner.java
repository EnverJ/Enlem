package Java1;

import java.util.Scanner;

public class myScanner {
	


	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("\n please enter age: ");
		int userAge=input.nextInt();
		if(userAge>=18){
			System.out.println("Adult");
		}else{
			System.out.println("No cigratee!!!");
		}
		
	

	}
	

}
