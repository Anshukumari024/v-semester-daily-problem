class Solution {
    public int maximum69Number (int num) {
        String s=String.valueOf(num);
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='6'){
                arr[i]='9';
                break;
            }
        }
         s = new String(arr);
        return Integer.parseInt(s);

        
    }
}