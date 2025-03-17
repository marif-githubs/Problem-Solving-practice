import java.util.Scanner;

public class LongestSubsequence {
    public static String findLCS(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        for (int[] g : dp){
            for (int p :g){
                System.out.print(p);
            }
            System.out.println();
        }
        // Backtrack to find the LCS string
        int i = m, j = n;
        StringBuilder lcs = new StringBuilder();

        while (i > 0 && j > 0) {
            System.out.println(i +","+j);
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                lcs.append(s1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        return lcs.reverse().toString();
    }

    public static  String seclcs(String st1, String st2){
        int s1 = st1.length(), s2 = st2.length();
        int [][]dp = new int[s1+1][s2+1];

        for (int i = 1 ; i <= s1 ; i++){
            for (int j = 1; j <= s2; j++) {
                if(st1.charAt(i - 1) == st2.charAt(j - 1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        for(int[] p:dp){
            for(int x:p){
                System.out.print(x);
            }
            System.out.println();
        }
        int i = s1 , j = s2;
        StringBuilder s = new StringBuilder();

        while(i > 0 && j > 0){
            if(st1.charAt(i-1) == st2.charAt(j-1)){
                s.append(st1.charAt(i-1));
                i--;
                j--;
            } else if (dp[i-1][j] > dp[i][j-1]) {
                i--;
            }else {
                j--;
            }
        }

        return s.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.next();
        System.out.print("Enter second string: ");
        String s2 = sc.next();

        String lcs = seclcs(s1, s2);
        System.out.println("Longest Common Subsequence: " + lcs);
        sc.close();
    }
}
