package Java1;

public class LogicalOperator11 {

	public static void main(String[] args) {
		// Logical Operator
		
	boolean isAdult=false;
	boolean isStuden=true;
	boolean isMember=true;
	System.out.println(isAdult && isStuden);
	System.out.println(isAdult || isStuden && isMember);
	System.out.println((isAdult && isStuden) && isMember);
	System.out.println(isAdult==true);
	System.out.println(!isAdult);
	String name="Ezmet";
	System.out.println((10>8 || 2<=2) && isAdult && name.contains("E"));
	
	

	}

}
