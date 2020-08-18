class commonSequence{
	public static int commonSeq(String s1 , String s2){
		int [][]matrix = new int[s1.length()+1][s2.length()+1];
		for(int i = 0;i<=s1.length();i++)
			matrix[i][0] = 0;
		for(int i = 0;i<=s2.length();i++)
			matrix[0][i] = 0;
		for(int i=1;i<=s1.length();i++)
		{
			for(int j=1;j<=s2.length();j++)
			{
				if(s1.charAt(i-1)==s2.charAt(j-1))
					matrix[i][j] = matrix[i-1][j-1] + 1;
				else
					matrix[i][j] = matrix[i-1][j] > matrix[i][j-1] ? matrix[i-1][j] : matrix[i][j-1];
			}
		}
		return matrix[s1.length()][s2.length()];

	}
	public static void main(String[] args) {
		String s1 = "Ankit";
		String s2 = "nkti";
		System.out.printf("Length of Common sequence in %s & %s is : %d",s1,s2,commonSeq(s1,s2));
	}
}