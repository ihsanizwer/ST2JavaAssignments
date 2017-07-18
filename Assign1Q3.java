//Izwer M.I.
//IT15010704
//Batch 01
import java.io.*;
class Assign1Q3{
	
	
	public static void main(String []args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			char c = '+';
	while(c=='*' || c=='/' || c=='+' || c=='-'){
		System.out.println("Enter");
		System.out.println("*: For multiplication");
		System.out.println("/: For division");
		System.out.println("+: For addition");
		System.out.println("-: For substraction");
		System.out.println("Any other character: To exit");
		System.out.println("Mathematical operation :");
		c = bf.readLine().charAt(0);	
		System.out.println("");
		switch(c){
			case '+':
				System.out.println("Enter first value");
				Double d = Double.parseDouble(bf.readLine());
				System.out.println("Enter second value");
				Double e = Double.parseDouble(bf.readLine());
				System.out.println(d+"+"+e+" = "+(d+e)+"\n");
			break;
			case '-':
				System.out.println("Enter first value");
				Double d2 = Double.parseDouble(bf.readLine());
				System.out.println("Enter second value");
				Double e2 = Double.parseDouble(bf.readLine());
				System.out.println(d2+"+"+e2+" = "+(d2-e2)+"\n");
			break;
			case '/':
				System.out.println("Enter dividend");
				Double d3 = Double.parseDouble(bf.readLine());
				System.out.println("Enter divisor value");
				Double e3 = Double.parseDouble(bf.readLine());
				System.out.println(d3+"+"+e3+" = "+(d3/e3)+"\n");
			break;
			case '*':
				System.out.println("Enter first value");
				Double d4 = Double.parseDouble(bf.readLine());
				System.out.println("Enter second value");
				Double e4 = Double.parseDouble(bf.readLine());
				System.out.println(d4+"+"+e4+" = "+(d4*e4)+"\n");
			break;
			default:
				break;
		}

		}
		
	}
}