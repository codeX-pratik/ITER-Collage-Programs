public class LongestCommonSubsequence {

    public static int lcs(String x, String y, int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (x.charAt(m - 1) == y.charAt(n - 1)) {
            return 1 + lcs(x, y, m - 1, n - 1);
        } else {
            return max(lcs(x, y, m, n - 1), lcs(x, y, m - 1, n));
        }
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }
    public static void main(String[] args) {
        String S1 = "AGGTAB";
        String S2 = "GXTXAYB";
        int m = S1.length();
        int n = S2.length();
        System.out.println("Length of LCS is " + lcs(S1, S2, m, n));
    }
}

/*

output : 
    Length of LCS is 4
    
 */