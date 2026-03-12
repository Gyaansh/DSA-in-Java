public class TowerOfHanoi {
    public static void hanoi(int n, String source, String helper, String dest){
        if(n==1) {
            System.out.println("Transfer disk "+n+" from "+source+" to "+dest);
            return;
        }
        hanoi(n-1, source, dest, helper);
        System.out.println("Transfer disk "+n+" from "+source+" to "+dest);
        hanoi(n-1, helper, source, dest);
    }
    public static void main(String[] args) {
        hanoi(3, "A", "B", "C");
    }
}
