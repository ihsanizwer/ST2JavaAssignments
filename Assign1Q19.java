//IT15010704
//Izwer M.I.
//batch 01
import java.util.*;
class Assign1Q19{
	public static void main(String []args){
		boolean playAgain = false;
		Scanner sc = new Scanner(System.in);
		
		do{
			playGame();
			System.out.println("Do you want to play Again?\n\tEnter \"0\" - No \n\tEnter \"1\" - Yes :");
			int p = sc.nextInt();			
			if(p==1){
				playAgain=true;
			}else if(p==0){
				System.exit(0);
			}		

		}while(playAgain);

	}
	
	static void playGame(){
		String s[] = {"CAT","DOG", "RAT","BAT","FLY","FLU","ZOO","IVY","ZAP","BAMBOO"};
		Scanner sc = new Scanner(System.in);
		int misses= 0,m=0;
		char c;
		char mC[] = new char[5];
			String rWord = s[new Random().nextInt(s.length)];
			char word[] = rWord.toCharArray();
			boolean b[]= new boolean[word.length];
		
			outer:while(misses<=5){
				System.out.println("-------------------------------");
				System.out.print("Word : \t");
				for(int i =0;i<word.length;i++){
					if(b[i]==true){
					System.out.print(word[i]);
					}
					else{
					System.out.print("_ ");
					}
				}

				System.out.print("\nMisses : "+misses+" ");
				for(char ch : mC){
					System.out.print(ch+" ");
				}
				System.out.println();
				System.out.print("Guess : ");
				c = Character.toUpperCase(sc.nextLine().charAt(0));
				System.out.println(c);
				for(int j =0; j<word.length;j++){
					if(c==word[j]){
						b[j] = true;
					}else{
						m++;
					}
				}
				if(m==word.length){
					if(misses<5)
					mC[misses] = c;
					misses++;
				}
				for(int k=0;k<word.length;k++){
					if(b[k]==false)
						break;
					else if(k==word.length-1){
						System.out.println("Congrats you are a winner, "+rWord+ " is the word!");
						break outer;
						}
				}
				if(misses==6){
					System.out.println("You lose!");
					break outer;
				}
				m=0;
				System.out.println("---------------------------------");
			}
	}
}
