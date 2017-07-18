//IT15010704
//Izwer M.I.
//batch 01
import java.util.Scanner; 
class Assign1Q18{
	static char arr[][]=new char[3][3];
	public static void main(String []args){
	Scanner s = new Scanner(System.in);
	int row, col, count =0;

	System.out.println("Begin Tic-Tac-Toe");
	

	while(count!=9){
		System.out.println("\'X\', Choose your location : ");
		System.out.println("Enter row number :");
		row = s.nextInt()-1;
		System.out.println("Enter the column number :");
		col = s.nextInt()-1;
		if(isValid(row,col)){
			mark('X',row,col,s);
			count++;
			displayArr();
		}
		else{
			while(!isValid(row,col)){
				System.out.println("Enter row number :");
				row = s.nextInt()-1;
				System.out.println("Enter the column number :");
				col = s.nextInt()-1;
			}
			mark('X',row,col,s);
			displayArr();
			count++;

		}

		if(count==9)
			break;

		System.out.println("\'O\', Choose your location : ");
		System.out.println("Enter row number :");
		row = s.nextInt()-1;
		System.out.println("Enter the column number :");
		col = s.nextInt()-1;
		if(isValid(row,col)){
			mark('O',row,col,s);
			count++;
			displayArr();
		}
		else{
			while(!isValid(row,col)){
				System.out.println("Enter row number :");
				row = s.nextInt()-1;
				System.out.println("Enter the column number :");
				col = s.nextInt()-1;
			}
			mark('O',row,col,s);
			displayArr();
			count++;

		}
	}

	System.out.println("Game over");
	}

	static void mark(char ch, int row, int col, Scanner sc){
		if(arr[row][col]=='X' || arr[row][col]=='O'){
			System.out.println("Choose a different location :");
			System.out.println("Enter a row:");
			row = sc.nextInt()-1;
			System.out.println("Enter a column:");
			col = sc.nextInt()-1;
			mark(ch, row, col, sc);
		}
		else{
			arr[row][col]=ch;
		}
	}

	static boolean isValid(int r, int c){
		return(r>=0 && r<=2 && c>=0 && c<=2);
	}

	static void displayArr(){
		for(int i =0;i<3; i++){
			System.out.println();
			for(int j = 0; j<3;j++){
				System.out.print("\t"+arr[i][j]);
			}
		}
		System.out.println();
	}
}