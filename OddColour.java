public class OddColour {
    public static void main(String[] args) {
        System.out.println(oddout(new char[]{'a','b','b','b','b','c','c','f','c','a','f','c'}));
        System.out.println(oddcolorout(new char[]{'a','b','b','b','c','c','c','a','f','c'}));
    }
    static char oddout(char[] s){
        for (int i = 0; i < s.length; i++) {
            int count = 0;
            for (int j = 0; j < s.length; j++) {
                if(s[i] == s[j]){
                    count++;
                }

            }
            if(count % 2 != 0 ) return s[i];
        }
        return 0;
    }
    static String oddcolorout(char[] s){
        String res = "";
        for (char c : s) {
            int count = 0;
            for (char value : s) {
                if (c == value) {
                    count++;
                }

            }
            if (!res.contains(Character.toString(c))) if (count % 2 != 0) res += c;
        }
        return res;
    }
}
