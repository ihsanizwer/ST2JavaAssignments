//IT15010704
//Izwer M.I.
//Batch 01
class Assign1Q17{
	public static void main(String [] args){
		for(int i=9;i>0;i--){
			if(i==6){
				continue;
				//this condition is to get the exact shape as in the given question where the 6th iteration is omitted
			}
			else{
				for(int j=1;j<=i;j++){
					System.out.print(i);
				}
				for(int l=i;l<9;l++){
					System.out.print(" ");
				}
				for(int m=i;m<9;m++){
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++){
					System.out.print(i);
				}
				System.out.println();
			}
		}
	}
}