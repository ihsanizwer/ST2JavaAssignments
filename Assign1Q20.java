//IT15010704
//Izwer M.I
//batch 01
import java.util.*;
class Assign1Q20{
	public static void main(String [] args){
		int holeCard, openCard, dTotal, dCard;
		int playerC1, playerC2, pTotal, pCard;
		Scanner s = new Scanner(System.in);
		int cards[] = {2,3,4,5,6,7,8,9,10,11};
		String pChoise, dChoise;

		playerC1 = cards[new Random().nextInt(cards.length)];
		playerC2 = cards[new Random().nextInt(cards.length)];
		pTotal = playerC1+playerC2;
		
		holeCard = cards[new Random().nextInt(cards.length)];
		openCard = cards[new Random().nextInt(cards.length)];
		dTotal = holeCard + openCard;		

		System.out.println("Begin game");
		System.out.println("Player1 You got cards, "+playerC1+" and "+playerC2+" and your total is, "+pTotal);
		System.out.println("Dealer has one card showing "+openCard+" and the other hidden, the total also is hidden.");

		do{	
			if(pTotal!=21){
				System.out.println("Player1, do you want to hit or stay?");
				pChoise = s.nextLine();
				if(pChoise.equalsIgnoreCase("hit")){
					pCard = cards[new Random().nextInt(cards.length)];
					pTotal = pTotal + pCard;
					busted(0, pTotal);
					System.out.println("You got "+pCard+" and your new total is"+ pTotal);
				}else if(pChoise.equalsIgnoreCase("stay")){
					System.out.println("Stay");
					break;
				}
			}else{
				if(dTotal!=21){
					System.out.println("Player1 wins! total is, "+pTotal);
					System.exit(0);
				}else{
					System.out.println("Dealer and player both got 21 as total");
					System.exit(0);
				}
			}


		}while(pTotal<=21);

		System.out.println("Dealer had "+holeCard+" hidden and has a total of, "+dTotal);
		busted(1,dTotal);

		do{

			if(dTotal!=21){
				if(dTotal==17){
					System.out.println("Stay");
					break;
				}
	
				System.out.println("Dealer, do you want to hit or stay?");
				dChoise = s.nextLine();
				if(dChoise.equalsIgnoreCase("hit")){
					dCard = cards[new Random().nextInt(cards.length)];
					dTotal = dTotal + dCard;
					busted(1, dTotal);
					System.out.println("You got "+dCard+" and your new total is"+ dTotal);
				}else if(dChoise.equalsIgnoreCase("stay")){
					System.out.println("Stay");
					break;
				}
			}
			else{
				if(pTotal!=21){
					System.out.println("Dealer wins, total is "+dTotal);
					System.exit(0);
				}else{
					System.out.println("Dealer and player both got 21 as total");
					System.exit(0);
				}
			}


		}while(pTotal<=21);
	
		if(pTotal>dTotal){
			System.out.println("Player1 wins, as His/Her total is, "+pTotal+ "and Dealer's total is, "+dTotal);
		}else if(pTotal<dTotal){
			System.out.println("Dealer wins, as His/Her total is, "+dTotal+" and Player1's total is, "+pTotal);
		}else{
			System.out.println("It is a draw, both have the total, "+pTotal);
		}

	}
	static void busted(int i, int t){
		switch(i){
			case 0:
				if(t>21){
					System.out.println("Player 1 got, "+t+" and is busted, dealer wins!");
					System.exit(0);
					}
			break;
			case 1:
				if(t>17){
					System.out.println("Dealer busted, "+t+" Player 1 wins!");
					System.exit(0);
					}
			break;	
		}
	}

}
//Note: I have added more functionality than specified to make the game more realistic. Otherwise there wouldn't be that much conditions

