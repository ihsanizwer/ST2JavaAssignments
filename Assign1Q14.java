//IT15010704
//Izwer M.I.
//Batch 01
import java.util.Scanner;
import java.util.StringTokenizer;
class Assign1Q14{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the text : ");
		String s1 = sc.nextLine();
		int i=0;


		StringTokenizer st =new StringTokenizer(s1);
		while(st.hasMoreTokens()){
			if(st.nextToken().charAt(0)=='a'){
				i++;
			}
		}
		System.out.println("Number of tokebns starting with a = "+i);
	}
}