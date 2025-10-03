class Solution {
    public boolean isValidSudoku(char[][] board) {
        return sudoku(board,9);
        
    }
    public boolean sudoku(char[][] board,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]!='.'){
                    if(!isValid(board,board[i][j],i,j,n)) return false;
                }
            }
        }
        return true;
    }
    public boolean isValid(char[][] board,char ch,int r,int c,int n){
        for(int i=r+1;i<n;i++){
            if(board[i][c]==ch) return false;
        }
        for(int i=c+1;i<n;i++){
            if(board[r][i]==ch) return false;
        }
        int rr=r-(r%3);
        int cc=c-(c%3);
        for(int i=rr;i<rr+3 && i<9;i++){
            for(int j=cc;j<cc+3 && j<9;j++){
                if(board[i][j]==ch && i!=r && j!=c) return false;
            }
        }
        return true;
    }
}