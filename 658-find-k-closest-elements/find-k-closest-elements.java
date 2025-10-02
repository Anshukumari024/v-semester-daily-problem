class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n=arr.length;
        List<Integer> list=new ArrayList<>();
        int l=0;
        int r=0;
        int idx=Arrays.binarySearch(arr, x);
        if(idx>0){
            l=idx-1;
            r=idx+1;
            list.add(x);
        }
        else if(idx<0){
            idx=-(idx) - 1;
            if(idx==0){
                int j=0;
                while(k-->0){
                    list.add(arr[j]);
                    j++;
                }
                Collections.sort(list);
                return list;
            }
            l=idx-1;
            r=idx;
        }
        else{
            int j=0;
            while(k-->0){
                    list.add(arr[j]);
                    j++;
            }
            Collections.sort(list);
            return list;         
        }

        while(l>=0 && r<arr.length && list.size()<k){
            int ld=Math.abs(arr[l]-x);
            int rd=Math.abs(arr[r]-x);
            if(ld<=rd){
                list.add(arr[l]);
                l--;
            }
            else{
                list.add(arr[r]);
                r++;
            }
        }

        while(list.size()<k){
           if(r<arr.length-1){
            list.add(arr[r]);
            r++;
           }
           else {
            list.add(arr[l]);
            l--;
           }
        }
        Collections.sort(list);
        return list;
        }
    }
