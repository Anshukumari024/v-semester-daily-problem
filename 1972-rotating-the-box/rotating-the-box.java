class Solution {
    public char[][] rotateTheBox(char[][] arr) {
       int m = arr.length;       
        int n = arr[0].length;     
        char[][] rotated = new char[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][m - 1 - i] = arr[i][j];
            }
        }
         m =rotated.length;       
         n = rotated[0].length; 
        for(int j=0;j<n;j++){
            int sp=m-1;
            for(int i=m-1;i>=0;i--){
                if(rotated[i][j]=='*'){
                    sp=i-1;
                    continue;
                }
                else if(rotated[i][j]=='#'){
                    rotated[i][j]='.';
                    rotated[sp][j]='#';
                    sp--;
                }
            }
        }
        return rotated;
    }
}