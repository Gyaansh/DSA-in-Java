public class StaircaseSearch {

    // Starting from top right (0, n-1)
    // public static boolean search(int[][] matrix, int key){
    //     int row = 0, col = matrix[0].length-1;
    //     while(row < matrix.length && col >= 0){
    //         if(matrix[row][col] == key){
    //             System.out.println("Key found at ("+row+ ","+ col +") index");
    //             return true;
    //         }
    //         else if(matrix[row][col] > key){
    //             col--;
    //         }
    //         else{
    //             row++;
    //         }
    //     }
    //     System.out.println("key not found");
    //     return false;
    // }


    // Starting from bottom left (n-1 , 0)
    public static boolean search(int[][] matrix, int key){
        int row = matrix.length-1 , col = 0;
        while(row >= 0 && col < matrix[0].length){
            if(matrix[row][col] == key){
                System.out.println("Key found at ("+row+ ","+ col +") index");
                return true;
            } else if(matrix[row][col]  > key){
                row--;
            }
            else {
                col++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String[] args) {
        int[][] mat = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int key = 14;
        search(mat, key);
    }
}
