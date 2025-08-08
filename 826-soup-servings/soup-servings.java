class Solution {
    public double soupServings(int n) {
        if (n > 4800) { 
            return 1.0;
        }

        int units = (n + 24) / 25; 
        double[][] memo = new double[units + 1][units + 1];
        for (int i = 0; i <= units; i++) {
            for (int j = 0; j <= units; j++) {
                memo[i][j] = -1;
            }
        }

        return probability(units, units, memo);
    }
    public double probability(int soupA, int soupB, double[][] memo) {
        if (soupA <= 0 && soupB > 0) {
            return 1.0; 
        }
        if (soupA <= 0 && soupB <= 0) {
            return 0.5;
        }
        if (soupA > 0 && soupB <= 0) {
            return 0.0; 
        }
        if (memo[soupA][soupB] != -1) {
            return memo[soupA][soupB];
        }

        double option1 = 0.25 * probability(soupA - 4, soupB, memo);     
        double option2 = 0.25 * probability(soupA - 3, soupB - 1, memo);
        double option3 = 0.25 * probability(soupA - 2, soupB - 2, memo); 
        double option4 = 0.25 * probability(soupA - 1, soupB - 3, memo); 

        return memo[soupA][soupB] = option1 + option2 + option3 + option4;
    }
}
