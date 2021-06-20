package whiteBorad;

class protectedAccess {
	protected String name="Enver";
	protected int age=29;
}
	class access extends protectedAccess{
		private int salary=50;

	public static void main(String[] args) {
		// only accessible in same package and subclass
		
		access ac=new access();
		System.out.println(ac.name+"   "+ac.age+"    "+ac.salary);
		

	

}
}