public class StringValid {
    //if string contains equal number of * and # this string is valid
    public static void main(String[] args) {
        String s = "##***#**#";
        System.out.println(check(s));
    }
    static int check(String s){
        int n = s.length();
        int temp = 0;
        for(int i= 0; i < n ; i++) {
            if(s.charAt(i) == '*'){
                temp++;
            }
            else {
                temp--;
            }

        }
        return temp == 0 ? 0 : temp;
    }
}
