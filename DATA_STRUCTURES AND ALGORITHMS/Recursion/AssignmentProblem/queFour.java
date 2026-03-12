public class queFour {
    public static int subString(String str , int i, int j , int count){
        if(i == str.length()){
            return count;
        }
        if(str.charAt(i) == str.charAt(j)){
            // System.out.print(str.substring(i,j+1) + " ");
            count +=1;

        }
        if(j==str.length()-1){
            i++;
            j=0;
        }
        count = subString(str, i, j+1,count);
        return count ;

    }

    // public static int subString(String str,int i, int j){
    //     if(str.length()==1) return 1;
    //     if(str.length()<=0) return 0;


    // }
    public static void main(String[] args) {
        int x =subString("abcab", 0, 0,0);
        System.out.println(x);
    }
}
