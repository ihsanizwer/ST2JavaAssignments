//IT15010704
//Izwer M.I.
//Batch 01
class Assign1Q1{
	public static void main(String [] args){
		int age = 34;
		//Change the above variable as required to get the required output
		
		if(age< 25){
			System.out.println("You cannot rent a house");
			if(age<18){
				System.out.println("You cannot vote");
				if(age<16){
					System.out.println("You cannot drive");
				}
			}
		}else{
			System.out.println("You can do anything that is legal");
		}
	}
}