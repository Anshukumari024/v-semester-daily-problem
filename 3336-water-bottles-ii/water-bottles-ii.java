class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
       int f=numBottles;
       int e=0;
       int s=f;
       e=e+f;
       f=0;
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