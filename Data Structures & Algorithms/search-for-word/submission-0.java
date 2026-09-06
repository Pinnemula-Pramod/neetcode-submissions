class Solution {
    public boolean slove(int i,int j,char b[][],String w,int ind){
        if(ind==w.length()){
            return true;
        }
        if(i<0 || i>=b.length || j<0 || j>=b[0].length || b[i][j]!=w.charAt(ind)) return false;
        boolean found=false;
        char temp=b[i][j];
        b[i][j]='.';
        found=slove(i+1,j,b,w,ind+1)||slove(i,j+1,b,w,ind+1)|| slove(i-1,j,b,w,ind+1)|| slove(i,j-1,b,w,ind+1);
        b[i][j]=temp;
        return found;
    }
    public boolean exist(char[][] board, String word) {
       int n=board.length;
       int m=board[0].length;
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(slove(i,j,board,word,0)){
                return true;
            }
        }
       }
       return false;
    }
}
