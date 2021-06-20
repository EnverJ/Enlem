package whiteBorad;

public class publicAccess {
	
	public String name="Enver";
	public int age=29;
	public boolean adult=true;

	public static void main(String[] args) {
		// Accessible for all class
		publicAccess p=new publicAccess();
		System.out.println("Name: "+p.name+"    "+"Age=  "+p.age+"   "+"Adult= "+p.adult);
		//privatge access cannot be accessed out of the class
		privateAccess pr=new privateAccess();
		//Default access
		deafaultAccess dn=new deafaultAccess();
		System.out.println("Default Access:  "+dn.name+"   "+dn.age);
	
		

	}

}
