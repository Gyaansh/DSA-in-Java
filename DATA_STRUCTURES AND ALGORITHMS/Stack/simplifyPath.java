import java.util.Stack;

public class simplifyPath {
    static void simplify(String str){
        Stack<String> s = new Stack<>();
        StringBuilder res = new StringBuilder("");
        StringBuilder dir = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
           while(i<str.length() && str.charAt(i)=='/'){
            i++;
           }
           
           while(i<str.length() && str.charAt(i)!='/'){
               dir.append(str.charAt(i));
               i++;
            }
            if(dir.toString().equals("..") && !s.isEmpty()){
                s.pop();
            }
            else if(dir.toString().equals(".")){
                dir.setLength(0);
                continue;
            }
            else{
            s.push(dir.toString());
           }
           dir.setLength(0);
        }
        
        for (int i = 0; i < s.size(); i++) {
           res.append("/"+s.get(i));
        }
        if(res.isEmpty()){
            res.append('/');
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        String str = "/a/b/c/d/./././././../..";
        simplify(str);
    }
}
