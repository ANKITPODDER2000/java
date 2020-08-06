public class array3d{
	public static void main(String args[]){
		int [][][]arr = new int[3][3][3];
		
		for(int i = 0;i<3;i++)
		{
			for(int j = 0;j<3;j++){
				for(int k = 0;k<3;k++){
					arr[i][j][k] = i * j * k;
				}
			}
		}

		System.out.println("Array is := ");
		
		for(int i = 0;i<3;i++)
		{
			for(int j = 0;j<3;j++){
				for(int k = 0;k<3;k++){
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}