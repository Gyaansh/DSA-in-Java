import java.util.Arrays;
class array {
    public static boolean sorted(int[] arr, int i) {
        if(i == arr.length-1) return true;
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return sorted(arr, i+1);
    }
    public static int find(int[] arr,int i, int key){
        if(arr[i] == key) return i;
        if(i == arr.length-1) return -1;
        return find(arr, i+1, key);
    }
    public static int findLast(int[] arr,int i, int key){
        if(i == arr.length-1) return -1;
        int a = findLast(arr, i+1, key);
        if(arr[i] == key && a==-1) return i;
        return a;
    }
    // public static int exp(int x, int n){
    //     if(n==0) return 1;
    //     return x * exp(x,n-1);
    // }
    // Optimized
    public static int exp(int x, int n) {
        if(n==0) return 1;
        int sq = exp(x,n/2);
        if(n%2==0) return sq*sq;
        return x * sq * sq;
    }

    //Tile problem (Amazon)
    public static int countWays(int n){ // board = 2 * n
        if (n == 0 || n == 1) return 1;
        return countWays(n-1) + countWays(n-2);
    }

    //Remove Duplicates from string
    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean[] map){
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char curr = str.charAt(idx);
        int currIdx = curr - 'a';
        if(map[currIdx] == true){
            removeDuplicate(str, currIdx+1, newStr, map);
        } else{
            map[currIdx]=true;
            removeDuplicate(str, currIdx+1, newStr.append(curr), map);
        }
    }
    

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4,5,8};
        // System.out.println(sorted(arr,0));
        // System.out.println(find(arr, 0, 8));
        // System.out.println(findLast(arr, 0, 5));
        // System.out.println(exp(2,10));
        // System.out.println(countWays(4));
        String str = "apnacollege";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);

    }
}