class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int n=numBottles;
        int c=numBottles;
        while(n>=numExchange){
            int rem=n%numExchange;
            int q=n/numExchange;
            c+=q;
            n=rem+q;
        }
        return c;
    }
}