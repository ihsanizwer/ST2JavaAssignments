//IT15010704
//Izwer M.I.
//Batch 01
import java.util.Scanner;
class Assign1Q10{

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int total;

		System.out.println("I will add up the numbers you give me");
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		total = num;
		System.out.println("Total so far : "+total);


		while(num!=0){
			System.out.println("Enter number");
			num = sc.nextInt();
			total+=num;
			System.out.println("Total so far : "+total);
		}
		System.out.println("Thank you for playing");
	}
}