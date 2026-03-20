public class gridWays {
    public static int count = 0;

    public static void ways(int m, int n, int i, int j) {
        if (i == m - 1 && j == n - 1) {
            count++;
            return;
        } else if(i==m || j==n){
            return ;
        }
        
        //move right
        ways(m, n, i, j + 1);

        // move down
        ways(m, n, i + 1, j);
    }

    public static void main(String[] args) {
        int m = 5, n = 4;
        ways(m, n,0 , 0);
        System.out.println("Count :"+count);
    }
}
