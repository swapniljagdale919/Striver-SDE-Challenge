import java.util.* ;
import java.io.*; 
public class Solution {
  
  // BruteForce Approach
    public static void setZeros(int matrix[][]) {
        int rows = matrix.length; int col = matrix[0].length;
        
        for(int i = 0 ;i < rows ; i++){
            for( int j = 0 ; j<col ; j++){
                
                if(matrix[i][j]==0){
                    int index = i-1;
                    
                    while(index >= 0){
                        if(matrix[index][j] != 0){
                            matrix[index][j] = -1;
                        }
                        index--;
                    }
                    index = i+1;
                    
                    while(index < rows){
                        if(matrix[index][j] != 0){
                            matrix[index][j] = -1;
                        }
                        index++;
                    }
                    index = j-1;
                    while( index >=  0){
                        if(matrix[i][index] != 0){
                            matrix[i][index] = -1;
                        }
                        index --;
                    }
                    index =  j+1;
                   
                    while(index < col){
                        if(matrix[i][index] != 0){
                            matrix[i][index] = -1;
                        }
                        index++;
                    }
 
                }
                
            }
        }// end of outer for loop
        
        for(int i = 0 ;i<rows;i++){
            for(int j = 0 ; j<col ;j++){
                if (matrix[i][j] <= 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        
    }

}
