//IT15010704
//Izwer M.I.
//Batch 01
import java.io.*;
class Assign1Q5{
	public static void main(String [] args)throws IOException{
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int marks = 0;

		System.out.println("Enter the answer number of the question:");
		System.out.println("\nQ1. What is the capital of Iceland?");
		System.out.println("\t1) Aukland");
		System.out.println("\t2) Reykjavik");
		System.out.println("\t3) Nuuk");

		int ans1 = Integer.parseInt(bf.readLine());
		if(ans1==2){
			marks++;
			System.out.println("That is Correct!");
		}else{
			System.out.println("Wrong answer :(");
		}
		
		System.out.println("\nQ1. Who is know as 'the mayor of silicon valley'?");
		System.out.println("\t1) Steve Jobs");
		System.out.println("\t2) Tim Berners-Lee");
		System.out.println("\t3) Robert Noyce");

		int ans2 = Integer.parseInt(bf.readLine());
		if(ans2==3){
			marks++;
			System.out.println("That is Correct!");
		}else{
			System.out.println("Wrong answer :(");
		}
		

		System.out.println("\nQ1. Who is the current CEO of Google inc?");
		System.out.println("\t1) Sundar Pichai");
		System.out.println("\t2) Larry Page");
		System.out.println("\t3) Sergey Brin");

		int ans3 = Integer.parseInt(bf.readLine());
		if(ans3==1){
			marks++;	
			System.out.println("That is Correct!");
		}else{
			System.out.println("Wrong answer :(");
		}
		

		System.out.println("Quiz complete! Total marks: "+marks);

	}
}