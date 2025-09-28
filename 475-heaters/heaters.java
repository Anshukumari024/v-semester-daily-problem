class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        return radius(houses,heaters);
    }
    public static int radius(int[] houses,int[] heaters){
        int minradius=0;
        int l=0;
        int h=Math.max(houses[houses.length-1],heaters[heaters.length-1]);
        while(l<h){
            int mid=l+(h-l)/2;
        if(canHeatUp(houses,heaters,mid)){
            h=mid;
            minradius=mid;
        }
        else{
            l=mid+1;
        }
        }
        return minradius;
    }
    public static boolean canHeatUp(int[] houses,int[] heaters,int mid){
        int house=0;
        for(int heater:heaters){
            int lr=heater-mid;
            int rr=heater+mid;
            while(house<houses.length && lr<=houses[house] && rr>=houses[house]){
                house++;
            }
        }
        return house>=houses.length;
    }
}