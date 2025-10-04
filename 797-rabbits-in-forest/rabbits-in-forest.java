class Solution {
    public int numRabbits(int[] answers) {

        int c=0;
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<answers.length;i++){
            map.put(answers[i],map.getOrDefault(answers[i],0)+1);
        }
        int count=0;
         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int k = entry.getKey();
            int v = entry.getValue();
            int groupSize = k + 1;
            int groups = (v+k)/groupSize;
            count += groups * groupSize;
        }

        return count;
        
    }
}