class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        int n=classes.length;
      PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Double.compare(b.first, a.first));
        for(int i=0;i<n;i++){
            double c_pr=(double)(classes[i][0])/(classes[i][1]);
            double new_pr=(double)(classes[i][0]+1)/(classes[i][1]+1);
            double delta=new_pr-c_pr;
            pq.offer(new Pair(delta,i));
        } 

        while(extraStudents-->0){
            Pair now=pq.poll();
            // double delta=now.first;
            int idx=now.sec;
            classes[idx][0]++;
            classes[idx][1]++;

            double c_pr=(double)(classes[idx][0])/(classes[idx][1]);
            double new_pr=(double)(classes[idx][0]+1)/(classes[idx][1]+1);
            double delta=new_pr-c_pr;
            pq.offer(new Pair(delta,idx));


        }
        double ans=0.0;
        for(int i=0;i<n;i++){
            ans+=(double)classes[i][0]/classes[i][1];
        }
        return ans/n;

        
    }
   class Pair{
            double first;
            int sec;
            Pair(double first,int sec){
                this.first=first;
                this.sec=sec;
            }
        }
}