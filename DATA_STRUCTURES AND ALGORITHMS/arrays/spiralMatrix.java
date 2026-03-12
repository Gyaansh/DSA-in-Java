public class spiralMatrix {
public static void spiral(int[][] matrix){
    int rows = matrix.length; //3
    int cols = matrix[0].length;//4
    int top = 0, bottom = rows-1;
    int left = 0, right = cols-1;

    while(left <= right && top <= bottom){
// System.out.println("While");
        //Top row  1        2
        for(int i=left; i<=right;i++){
            // System.out.println("First");
            System.out.print(matrix[top][i]+" ");
        }
        top++;

        // Right column 
        for (int i = top; i <= bottom; i++) {
            System.out.print(matrix[i][right] + " ");
        }
        right--;
        // Bottom row
        if(top <= bottom){
            for (int i = right; i >= left; i--) {
                System.out.print(matrix[bottom][i] + " ");
            }
            bottom--;
        }

        //Left column 2             1
        if(left <= right){
            for (int i = bottom; i >= top; i--) {
                System.out.print(matrix[i][left] + " ");
            }
            left++;
        }
        // System.out.println(top +" "+ right +" "+ bottom +" "+ left);
    }

}

    public static void main(String[] args) {
        int [][]matrix={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
            
        };//1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10
        spiral(matrix);
    }
}
