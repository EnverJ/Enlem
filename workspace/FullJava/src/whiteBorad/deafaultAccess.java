package whiteBorad;

public class deafaultAccess {
	String name="Enver";
	int age=29;
	

	public static void main(String[] args) {
		// only Accessible in the same package
		deafaultAccess dn=new deafaultAccess();
		System.out.println(dn.name+"   "+dn.age);
		
		
//		access ac=new access();
//		System.out.println(ac.name+"   "+ac.age+"    "+ac.salar);
		

	}

}
