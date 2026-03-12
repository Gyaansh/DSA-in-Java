public class queThree {
    public static int length(String str){
        if(str=="") return 0;
        return length(str.substring(1)) + 1;
    }
    public static void main(String[] args) {
        System.out.println(length("Gyaansh"));
    }
}
