//IT15010704
//Izwer M.I.
//Batch 01
import java.io.*;
class Assign1Q12{

public static void main(String [] args)throws IOException{
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	int digits= 0;
	int letters= 0;
	int spaces=0;

	System.out.println("Enter your text");
	String s1 = bf.readLine();
	for (int i =0; i<s1.length();i++){
		if(Character.isDigit(s1.charAt(i))){
			digits++;
		}
		else if (Character.isLetter(s1.charAt(i))){
			letters++;
		}
		else if(Character.isSpaceChar(s1.charAt(i))){
			spaces++;
		}
	}
	System.out.println("Number of digits : "+digits);
	System.out.println("Number of letters : "+letters);
	System.out.println("Number of spaces : "+spaces);
}
	
}
