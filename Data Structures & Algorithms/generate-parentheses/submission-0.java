class Solution {
    public void slove(int n,String s,int open, int close,List<String> list){
        if(s.length()==2*n){
            list.add(s);
            return;
        }
        if(open<n){
            slove(n,s+"(",open+1,close,list);
        }
        if(close<open){
            slove(n,s+")",open,close+1,list);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        slove(n,"",0,0,list);
        return list;
    }
}