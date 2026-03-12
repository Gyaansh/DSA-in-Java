public class matrixTranspose {

    // public static void transpose(int[][]  matrix){
    //     int row = 0, col = 0;
    //    for (int i = 0; i < matrix.length * matrix[0].length; i++){
    //         System.out.print(matrix[row][col] + " ");
    //         row++;
    //         if(row == matrix.length){
    //             col++;
    //             row=0;
    //             System.out.println();
    //         }
    //     }
    // }
    public static void transpose(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.err.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        transpose(mat);
    }
}