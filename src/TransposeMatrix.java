
public class TransposeMatrix {
	
	
	public static void main(String[] args) {
		transPoseMatrix(3,5);
	}
	
	static void printMatrix(int[][] matrix) {
		 for(int i=0;i<matrix.length;i++) {
			 for(int j=0;j<matrix[0].length;j++) {
				 System.out.print(matrix[i][j]+" ");
			 }
			 System.out.println();
		 }
	}
	
	static void transPoseMatrix(int r,int c) {
		int[][] matrix = new int[r][c];
		 
		 int count=0;
		 for(int i=0;i<r;i++) {
			 for(int j=0;j<c;j++) {
				 matrix[i][j]=++count;
			 }
		 }
		 
		 int[][] temp = new int[c][r];
		 
		 System.out.println("Before transpose");
		 printMatrix(matrix);
		 
		 for(int i=0;i<r;i++) {
			 for(int j=0;j<c;j++) {
					 temp[j][i]=matrix[i][j];	 
			 }
		 }
		 
		 matrix = temp;
		 System.out.println("After transpose");
		 printMatrix(matrix);
	}

}
