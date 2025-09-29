class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int minc=0,minr=0,maxc=arr[0].length-1,maxr=arr.length-1;
		int c=0;
		int te=arr.length*arr[0].length;
        if (arr.length == 0)
            return new ArrayList<>();
        List<Integer> ans = new ArrayList<>();       
		while(c<te) {
			for(int i=minc;i<=maxc && c<te;i++) {
				ans.add(arr[minr][i]);
				c++;
			}
			minr++;
			for(int i=minr;i<=maxr && c<te;i++) {
				ans.add(arr[i][maxc]);
				c++;
			}
			maxc--;
			for(int i=maxc;i>=minc && c<te;i--) {
				ans.add(arr[maxr][i]);
				c++;
			}
			maxr--;
			for(int i=maxr;i>=minr && c<te;i--) {
				ans.add(arr[i][minc]);
				c++;
			}
			minc++;
		}
        return ans;
    }
    
    
}