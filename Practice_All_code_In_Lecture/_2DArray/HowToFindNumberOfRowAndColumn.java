package Practice_All_code_In_Lecture._2DArray;

public class HowToFindNumberOfRowAndColumn {
    public static void main(String[] args) {
        HowToFindNumberOfRowAndColumn obj=new HowToFindNumberOfRowAndColumn();

        int row=5;
        int col=8;
        int[][] matrix=new int[row][col];
        obj.NumberOfRowAndColumn(matrix);
    }

    void NumberOfRowAndColumn(int[][] matrix){
        //find the length of row.
        System.out.println("The length of row :-"+" "+matrix.length);
        //find the length of column.
        System.out.println("The length of column :-"+" "+matrix[0].length);
    }

}
