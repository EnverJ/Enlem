package Java1;


import whiteBorad.privateAccess;
import whiteBorad.publicAccess;

public class First {
	public static void main(String[] args){
		// Write your code here, my first java code, 
		char a='A';
		System.out.println("Hi, I am Java: "+a);
		
		publicAccess p=new publicAccess();
		System.out.println("Name: "+p.name+"    "+"Age=  "+p.age+"   "+"Adult= "+p.adult);
		//privatge access cannot be accessed out of the class
		privateAccess pr=new privateAccess();
		//Default access
		deafaultAccess dn=new deafaultAccess();
		System.out.println("Default Access:  "+dn.name+"   "+dn.age);
		
	}

}
