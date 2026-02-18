class Solution {
    public static int[][] markrow(int [][]matrix,int i){
        for(int j=0;j<matrix[i].length;j++){
            if(matrix[i][j]!=0){
                matrix[i][j]=-10;
            }
            
        }
        return matrix;
    }
    public static int[][] markcol(int [][]matrix,int j){
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][j]!=0){
                matrix[i][j]=-10;
            }
            
        }
        return matrix;
    }
    public void setZeroes(int[][] matrix) {
        
        for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[i].length;j++){
                    if(matrix[i][j]==0){
                        markrow(matrix,i);
                        markcol(matrix,j);
                    }
                }
            }
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==-10){
                    matrix[i][j]=0;
                }
            }
        }
        
}
    

}
