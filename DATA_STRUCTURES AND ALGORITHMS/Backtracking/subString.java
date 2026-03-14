public class subString{

        public static void findSubSet(String str, String ans, int i){
            // base case
            if(i == str.length()){
                if(ans.length()==0)
                    System.out.print("NULL");
                else
                    System.out.print(ans + " ");
                return;
            }
            //choose to be in sub-set 
            findSubSet(str, ans + str.charAt(i), i+1);
            
            //choose not to be in the sub-set
            findSubSet(str, ans, i+1);
        }


    public static void main(String[] args) {
        String str = "ABC";
        findSubSet(str, "", 0);
    }
}