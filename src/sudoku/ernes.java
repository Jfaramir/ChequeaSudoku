/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.util.Arrays;

/**
 *
 * @author xp
 */
public class ernes {
    public boolean chequeaSudoku (int[][]matriz){
        //
        int error = 0;
       
        for (int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                error -=1;
            
                for (int k=0;k<matriz.length;k++){
                    for(int m=0;m<matriz[k].length;m++){
                        System.out.println(error);
                        if(matriz[i][j] == matriz[k][m]){
                            error+=1;
                            
                        }
                    }
                }
            }
            
        }     
        if (error == 0){
            return true;
            
        }
        
             return false;
    }

    
    
    
    public static void main(String[] args) {
        ernes pruebaSudoku = new ernes();
        System.out.println(pruebaSudoku.chequeaSudoku(new int[][]{{},{4,5,6},{7,8,9}}));
        
        System.out.println(pruebaSudoku.chequeaSudoku(new int[][]{{3,3,3},{4,5,6},{7,8,9}}));
        System.out.println(pruebaSudoku.chequeaSudoku(new int[][]{{},{},{}}));
        System.out.println(pruebaSudoku.chequeaSudoku(new int[][]{{1,2,3},{4,5,6},{9,9,9}}));
        System.out.println(pruebaSudoku.chequeaSudoku(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
        System.out.println(pruebaSudoku.chequeaSudoku(new int[][]{{1,2,3},{4,5,6},{9,8,9}}));
        
        
    }
    
}
