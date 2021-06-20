package Java1;

import java.time.LocalDate;

public class MyPassport {

	public static void main(String[] args) {
		// calsses
		Passport usPassport=new Passport("23213123",LocalDate.of(2025, 1,31),"USA");
		Passport ukPassport=new Passport("23213123df",LocalDate.of(2025, 1,31),"UK");
		System.out.println(usPassport.country);
		System.out.println(ukPassport.number);
		
		

	}
	static class Passport{
		String number;
		LocalDate expiryDate;
		String country;
		Passport(String number, LocalDate expiryDate,String country){
			this.number=number;
			this.expiryDate=expiryDate;
			this.country=country;
			
			
			
		}
		
		
	}

}
