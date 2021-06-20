package Java1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class PackageImport7 {

	public static void main(String[] args) {
		// 
		LocalDate local=LocalDate.now();
		System.out.println(local);
		
		
		Date date=new Date();
		System.out.println(date);
		LocalDate localdate=LocalDate.now();
		LocalDateTime localDateTime= LocalDateTime.now();
		
	}

}
