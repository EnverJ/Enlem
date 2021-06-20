package whiteBorad;

public class privateAccess {
	
	private String name="Oghlem";
	private int age=25;
	
	

	public static void main(String[] args) {
		// Only Accessible in the declared class
		
		privateAccess pr=new privateAccess();
		System.out.println(pr.name+"  "+pr.age);
		
		//Public Access
		publicAccess p=new publicAccess();
		System.out.println("Name: "+p.name+"    "+"Age=  "+p.age+"   "+"Adult= "+p.adult);
		
		
		

	}

}
