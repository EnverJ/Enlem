package Java1;

public class EnhancedForLoop18 {

	public static void main(String[] args) {
		// Enhanced for loop
		int[] numbers={2,0,1,100,500,300};
		String[] names={"Enver","Oghlem"};
		for(int number:numbers){
			System.out.println(number);
		}
		
		for(String name:names){
			System.out.println(name);
		}
	}

}
