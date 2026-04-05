public class knightsTour {

    public static void tour(int[][] solution, int n) {
        int[] xMoves = { -2, -2, -1, 1, 2, 2, 1, -1 };
        int[] yMoves = { -1, 1, 2, 2, 1, -1, -2, -2 };
        visitAll(solution, n, 0, 0, xMoves, yMoves, 0);
    }

    public static boolean visitAll(int[][] solution, int n, int row, int col, int[] xMoves, int[] yMoves, int moves) {
        if(!(isSafe(solution, n, row, col))){
            return false;
        }
        if (moves == (n*n)-1) {
            solution[row][col] = moves;

            printBoard(solution);
            return true;
        }
        
        
        
        solution[row][col] = moves;
        for (int i = 0; i < 8; i++) {
            int nextRow = row + xMoves[i];
            int nextCol = col + yMoves[i];
            if(visitAll(solution, n, nextRow, nextCol, xMoves, yMoves, moves+1)){
                return true;
            }
        }
        solution[row][col] = -1;
        return false;
    }

    public static boolean isSafe(int[][] solution, int n, int row, int col) {
        if (row < 0 || row >= n || col < 0 || col >= n)
            return false;
        else if (solution[row][col] == -1)
            return true;
        return false;
    }

    public static void printBoard(int[][] solution) {
        for (int i = 0; i < solution[0].length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < solution[0].length; j++) {
                System.out.print(solution[i][j] + ", ");
            }
            System.out.print("]");
            System.err.println();
        }
        System.err.println();
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] solution = new int[n][n];
        for (int i = 0; i < solution[0].length; i++) {
            for (int j = 0; j < solution[0].length; j++) {
                solution[i][j] = -1;
            }
        }
        tour(solution, n);
    }
}
