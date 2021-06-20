package Java1;

import java.time.LocalDate;
import java.util.Scanner;

public class ScannerClass23 {

	public static void main(String[] args) {
		// Scanner
		Scanner scanner=new Scanner(System.in);
		System.out.println("What is your name?");
		String username=scanner.nextLine();
		System.out.println("Hello "+username);
		System.out.println("How old are you?");
	//	int age=scanner.nextLine();
		int year=LocalDate.now().minusYears(age).getYear();
		System.out.println("Your age is "+year);
		

	}

}
