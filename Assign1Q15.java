//IT15010704
//Izwer M.I.
//Batch 01
import java.util.Scanner;
class Assign1Q15{
	public static void main(String [] args){
		double earthWeight, pWeight=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter your earth weight :");
		earthWeight = s.nextDouble();

		System.out.println("I have information for the following planets:");
		System.out.println("\t1. Venus\t2. Mars\t\t3. Jupiter");
		System.out.println("\t4. Saturn\t5. Uranus\t6. Neptune");
		System.out.println("Which planet are you visiting?");
		int i = s.nextInt();

		switch(i){
			case 1:
			pWeight = earthWeight*0.78;
			break;
			case 2:
			pWeight = earthWeight*0.39;
			break;
			case 3:
			pWeight = earthWeight*2.65;
			break;
			case 4:
			pWeight = earthWeight*1.17;
			break;
			case 5:
			pWeight = earthWeight*1.05;
			break;
			case 6:
			pWeight = earthWeight*1.23;
			break;
			default:
			System.out.println("Incorrect selection. Please try again");
			System.exit(0);
		}
		System.out.println("Your weight would be "+pWeight+" on that planet");
	}
}