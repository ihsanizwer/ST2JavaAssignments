//IT15010704
//Izwer M.I.
//Batch 01
import java.util.Scanner;
class Assign1Q13{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int count = 0;

		System.out.print("Please enter a natural number : ");
		count++;
		int num = sc.nextInt();
		count++;
		System.out.println("Starting number : "+num);

		if(num==0){
			while(num==0){
				System.out.println("Cannot display Collatz sequence for zero. Enter another natural number");
				num = sc.nextInt();
				count++;
			}
		}
		else{
			count++;
			while(num!=1){
				if(num%2==0){
					num/=2;
					count++;
				}
				else{
					num *=3;
					count++;
					num+=1;
					count++;
				}
				System.out.print(num+"\t");
				
			}
			count++;
			System.out.println("1");
			System.out.println("Terminated after "+count+" steps.");
		}


	}
}