
public class keypadCombinations {

    public static void keypad(String num, StringBuilder sb, int pos) {
        if(pos == num.length() || num.length() == 0){
            System.out.print('"'+sb.toString()+'"'+" ");
            return;
        }
        char[] letters = getChar(num.charAt(pos));
        for (int i = 0; i < letters.length; i++) {
            keypad(num, sb.append(letters[i]),pos+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public static char[] getChar(char l){ //a-z == 97-122
        int n = Character.getNumericValue(l);
        char[][] chars = {
                {}, {}, { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' },
                { 'j', 'k', 'l' }, { 'm', 'n', 'o' },
                { 'p', 'q', 'r', 's' }, { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' }
        };
        return chars[n];
    }

    public static void main(String[] args) {
        keypad("23", new StringBuilder(), 0);
    }
}
