package Java1;

public class ClassObject26 {

	public static void main(String[] args) {
		// Class and Objects
		Lens lensOne = new Lens("Sony","85mm",true);
		Lens lensTwo = new Lens("Sony","30mm",true);
		Lens lensThree = new Lens("Canon","24mm",false);
		
		//Printing Attributes
		System.out.println("Lens 1");
		System.out.println(lensOne.brand);
		System.out.println(lensOne.focolLenth);
		System.out.println(lensOne.isPrime);
		
		System.out.println("Lens 2");
		System.out.println(lensTwo.brand);
		System.out.println(lensTwo.focolLenth);
		System.out.println(lensTwo.isPrime);
		
		System.out.println("Lens 3");
		System.out.println(lensThree.brand);
		System.out.println(lensThree.focolLenth);
		System.out.println(lensThree.isPrime);
		
		

	}
	
	//Blue print for creating object
	static class Lens{
		String brand;
		String focolLenth;
		boolean isPrime;
		// Constructor
		Lens(String brand, String focolLength,boolean isPrime){
			this.brand=brand;
			this.focolLenth=focolLength;
			this.isPrime=isPrime;
		}
		
		
	}

}
