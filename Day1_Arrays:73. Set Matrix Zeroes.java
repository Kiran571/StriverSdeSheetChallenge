class Solution {
    public void setZeroes(int[][] matrix) {
        int col0 = 1;
        //Step 1: Traverse matrix and mark 1st row and col
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == 0){
                    //mark ith row
                    matrix[i][0] = 0;

                    //mark jth column
                    if(j != 0)  matrix[0][j] = 0;
                    else col0 = 0;

                }
            }
        }

        //Step 2 :- Mark with 0 from (1,1) to (n-1,m-1)
        for(int i=1;i<n;i++){
            for(int j=1; j<m; j++){
                if(matrix[i][j] != 0){

                    //check for row and col
                    if(matrix[i][0] == 0 || matrix[0][j] == 0){
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        //Step 3 : Finally mark 1st col and then 1st row
        if(matrix[0][0] == 0){
            for(int j=0;j<m;j++){
                matrix[0][j] = 0;
            }
        }
        if(col0 == 0){
            for(int i=0;i<n;i++){
                matrix[i][0] = 0;
            }
        }
        
    }
}
