class print1ton{

    public static void print(int n){
        if(n==0) return;
        print(n-1);
        System.out.println(n);
    }
    public static void printDec(int n){
        if(n==0) return;
        System.out.println(n);
        printDec(n-1);
    }
    public static int printSum(int n){
        if(n==1) return 1;
        return n + printSum(n-1);
    }
    public static int fibo(int n){
        if(n==0 || n==1) return n;
        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) {
        // print(5);
        // printDec(5);
        // System.out.println(printSum(5));
        for (int i = 1; i < 11; i++) {
            System.out.println(fibo(i));
        }
    }
}