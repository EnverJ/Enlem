package Java1;

import java.util.Arrays;

public class Method25 {

	public static void main(String[] args) {
		// Method

		char[] letters={'A','A','B','C','D','D'};
//		countOccur();
		String [] names={"Enver","Oghlem"};
		int count =countOccur(letters, 'Z');
		System.out.println(count);
	}

	public static int countOccur(char [] letters,char searchletter) {
//		System.out.println();
//		return 0;
		//use defined methods
		System.out.println(Arrays.toString(letters));
		System.out.println(searchletter);
		//
		int count =0;
		for(char letter:letters){
			if(letter==searchletter){
				count++;
			}
		}
		return count;
		

	}
}