//IT15010704
//Izwer M.I.
//Batch 01
class Assign1Q16{
	public static void main(String [] args){
		int arr1[][] ={{0,1,2},{9,8,7}};
		int arr2[][] ={{6,5,4},{4,3,5}};
		System.out.println("Matrix 1\t+ Matrix 2 =\tResult");
		for(int i =0;i<2;i++){
			System.out.print("|");
			for(int j=0;j<3;j++){
				System.out.print(arr1[i][j]+" ");
			}
			System.out.print("|");
			System.out.print("\t|");
			for(int x=0;x<3;x++){
				System.out.print(arr2[i][x]+" ");
			}
			System.out.print("|");
			System.out.print("\t|");
			for(int z=0;z<3;z++){
				System.out.print((arr1[i][z]+arr2[i][z])+" ");
			}
			System.out.print("|");
			System.out.println();
		}
	}
}