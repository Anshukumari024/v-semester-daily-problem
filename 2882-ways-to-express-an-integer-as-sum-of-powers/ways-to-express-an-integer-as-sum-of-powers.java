import java.util.*;

class Solution {
    static int MOD = 1_000_000_007;

    public int numberOfWays(int n, int x) {
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return perfect(n, 1, x, dp);
    }

    public static int perfect(int n, int num, int x, int[][] dp) {
        if (n == 0) return 1;
        if (n < 0) return 0;
        if (num > n) return 0; 

        if (dp[n][num] != -1) return dp[n][num];

        long power = powInt(num, x);
        if (power > n) return dp[n][num] = 0;

        int have = perfect(n - (int) power, num + 1, x, dp);
        int not_have = perfect(n, num + 1, x, dp);

        return dp[n][num] = (have + not_have) % MOD;
    }

    public static long powInt(int base, int exp) {
        long result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }
}
