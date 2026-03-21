public class mouseMaze {
    public static void solveMaze(int[][] maze){
        int N = maze[0].length;
        int[][] solution = new int[N][N];
        solve(maze, solution, 0, 0, N);
    }
    static int numberOfSolutions;
    public static boolean solve(int[][] maze,int[][] solution, int row, int col, int N) {
        // base case
        if (row == N - 1 && col == N - 1) {
            solution[row][col]=1;
            printSolution(solution, N);
            numberOfSolutions++;
            return true;
        }
        
        if ((row < 0 || row == N) || (col < 0 || col == N))
            return false ;
        
        if(solution[row][col] == 1){
            return false;
        }

        if (maze[row][col] == 0) {
            return false;
        }
        


        solution[row][col] = 1;
        solve(maze,solution, row+1, col, N); // Down
        solve(maze,solution, row, col+1, N); // Right

        solution[row][col] = 0;
        
        return false; // This one doesn't matter
    }

    public static void printSolution(int[][] solution, int N) {
        System.out.println("---------- ----------Solution Maze ----------");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(solution[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] maze = {
                { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 0, 1, 0, 1 },
                { 1, 1, 1, 1 }
        };
        solveMaze(maze);
        if(numberOfSolutions  == 0)
            System.out.println("No Solution");
        

    }
}
