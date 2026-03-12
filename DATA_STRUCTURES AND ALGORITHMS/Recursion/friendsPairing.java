class friendsPairing{

    public static int countPairs(int n){
        if(n==1 || n==2) return n;
        int single = countPairs(n-1);
        return single + (n-1) * countPairs(n-2);
    }

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println(i+" "+countPairs(i));
        }
    }
}