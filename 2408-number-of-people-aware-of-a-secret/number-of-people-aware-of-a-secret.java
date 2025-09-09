class Solution {
    int M = (int)1e9 + 7;
    Integer[] memo;
    int N, Delay, Forget;

    public int peopleAwareOfSecret(int n, int delay, int forget) {
        N = n;
        Delay = delay;
        Forget = forget;
        memo = new Integer[n + 1];

        long total = 0;
        for (int day = n - forget + 1; day <= n; day++) {
            if (day > 0) {
                total = (total + dp(day)) % M;
            }
        }
        return (int) total;
    }

    private int dp(int day) {
        if (day == 1) return 1;
        if (memo[day] != null) return memo[day];

        long res = 0;
        for (int prev = day - Forget + 1; prev <= day - Delay; prev++) {
            if (prev > 0) {
                res = (res + dp(prev)) % M;
            }
        }
        return memo[day] = (int) res;
    }
}
