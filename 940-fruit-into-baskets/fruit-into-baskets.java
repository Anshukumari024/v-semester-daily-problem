class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map= new HashMap<>();
        int max = 0;
        int l = 0;
        for(int r=0;r<fruits.length;r++){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
            while(map.size()>2){
                int le=(fruits[l]);
                map.put(le,map.get(le)-1);
                if(map.get(le)==0){
                    map.remove(le);
                }
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}