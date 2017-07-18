//IT15010704
//Izwer M.I.
//Batch 01
import java.io.*;
class Assign1Q2{
	public static void main(String [] args){

		System.out.println("Enter a random number from 1 to 10 :");
		try{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int userInput = Integer.parseInt(bf.readLine());
		int randomNumber = (int) Math.ceil(Math.random() * 10);
		if(userInput==randomNumber){
			System.out.println("Correct! "+userInput+" is the number that was generated");
		}
		else{
			System.out.println("Incorrect! "+randomNumber+" is the number that was generated and "+userInput+" was the number you entered");
		}
		}catch(IOException e){
			System.out.println("Caught");
		}
	}
}