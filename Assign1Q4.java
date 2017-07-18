//IT15010704
//Izwer M.I.
//Batch 01
class Assign1Q4{
	
	public static void main(String [] args){
		Double gpa = Double.parseDouble(args[0]);
		if(gpa>=3.6){
			System.out.println("First Class Hons");
		}
		else if(gpa>=3.4){
			System.out.println("Upper Second Class Hons");
		}
		else if(gpa>=3.0){
			System.out.println("Lower second Class hons");
		}else if (gpa>=2.0){
			System.out.println("Pass");
		}
	}
}