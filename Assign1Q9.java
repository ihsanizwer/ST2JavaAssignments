//IT15010704
//Izwer M.I.
//Batch 01
import java.util.Scanner;
class Assign1Q9{
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Count from :");
		int a = sc.nextInt();
		System.out.print("Count to :");
		int b = sc.nextInt();
		System.out.print("Count By :");
		int c = sc.nextInt();

		System.out.println();
		for(int i = a; i<=b; i=i+c){
			System.out.print(i+" ");
		}
	}
}