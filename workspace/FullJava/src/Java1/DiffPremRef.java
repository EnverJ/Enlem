package Java1;

public class DiffPremRef {

	public static void main(String[] args) {
		// 	// Difference between Reference and primitive
		int a=10;
		int b=a;
		a=100;
		System.out.println("a="+a+"----"+"b="+b);
		
		
		Person alex= new Person("Alex");
		Person mariam=alex;
		System.out.println("Before changing alex");
		System.out.println(alex.name+" "+ mariam.name);
		
		alex.name="Alexander";
		System.out.println("After changing ");
		System.out.println(alex.name+" "+ mariam.name);
		

	}
	
	
	static class Person{
		String name;
		Person(String name){
			this.name=name;
		}
	}

}
