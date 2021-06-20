package Java1;

public class BreakContinue20 {

	public static void main(String[] args) {
		// Break & Continue
		String[] names={"Enver","Oghlem","Ezmet","Zeynep"};
		for(String name:names)
		{
			if(name.equals("Ezmet")){
			//		break;
				continue;
			}
			System.out.println(name);
		}

	}

}
