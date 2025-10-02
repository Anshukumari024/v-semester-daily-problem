class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
       int s=numBottles;
       int e=numBottles;
       int f=0;
       while(e>0){
        if(e<numExchange) break;
        e=e-numExchange;
        f++;
        s+=f;
        numExchange++;
        e=f+e;
        f=0;
       }
       return s;
        
    }
}