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
public class Sudoku {
    public boolean chequeaSudoku (int[][]matriz){
        //
        int error = -9;
        int contador = 0;
        if (matriz.length == 0 ){
            return false;
        }
        for (int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                contador-=1;
                if (matriz[i][j] ==0){
                    return false;
                }
                for (int k=0;k<matriz.length;k++){
                    for(int m=0;m<matriz[k].length;m++){
                         if (matriz[i][j] ==contador){
                             return false;
                         }
                                
                        if(matriz[i][j] == matriz[k][m] ){
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
        Sudoku pruebaSudoku = new Sudoku();
        System.out.println(pruebaSudoku.chequeaSudoku(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
        System.out.println(pruebaSudoku.chequeaSudoku(new int[][]{{},{4,5,6},{7,8,9}}));
        System.out.println(pruebaSudoku.chequeaSudoku(new int[][]{{3,3,3},{4,5,6},{7,8,9}}));
        System.out.println(pruebaSudoku.chequeaSudoku(new int[][]{{},{},{}}));
        System.out.println(pruebaSudoku.chequeaSudoku(new int[][]{{1,2,3},{4,5,6},{9,9,9}}));
        System.out.println(pruebaSudoku.chequeaSudoku(new int[][]{{1,2*4,3},{4,5,6},{7,8,9}}));
        System.out.println(pruebaSudoku.chequeaSudoku(new int[][]{{1,2,3},{-4,-5,6},{7,8,9}}));
        System.out.println(pruebaSudoku.chequeaSudoku(new int[][]{{1,2,3},{4,0,6},{7,8,9}}));
        
        
    }
    
}
