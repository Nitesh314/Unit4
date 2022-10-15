package Practice_All_code_In_Lecture._2DArray;
import java.util.*;
public class _2DArray {
    public static void main(String[] args) {
        //how to create 2D Array
        //<Data type>[][]<array name>=new <Data type>[Sizeof row][size of column];
        //print the 2,3 matrix inside 0 1 2 3 4 5;

        int r = 2;
        int c = 3;
        int count = 0;
        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = count;
                count++;
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println(matrix[i][j]);
            }
        }

        //**************************************************************************************************************

        //How to intiallized value in matrix array

        int [][] m = {
                {1,2,3,4},
                {5,11,7,8},
                {9,10,6,12}
        };


        for(int mr = 0; mr < m.length ; mr++){
            for(int mc = 0; mc < m[mr].length ; mc++){
               System.out.print(m[mr][mc] + " "); //this is print value.

            }
            System.out.println(); //this is break line and print matrix form.
        }
    }
}
