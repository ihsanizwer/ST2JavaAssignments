//IT15010704
//Izwer M.I.
//Batch 01
import java.util.Scanner;
class Assign1Q7{
	public static void main(String [] args){

		Scanner sc  = new Scanner(System.in);

		System.out.println("Enter the number you want to find the sqaure root of: ");

		int i = sc.nextInt();
		while(i<0){
			System.out.println("You cannot enter negative numbers. Please enter a positive number");
			i = sc.nextInt();
		}
		System.out.println("The square root of the number you entered is: "+Math.sqrt(i));
	}
}