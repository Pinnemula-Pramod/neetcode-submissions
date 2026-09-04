class Solution {
    public void slove(int ind,int n,int k,List<List<Integer>> list ,List<Integer>  temp){
        if(temp.size()==k){
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int i=ind;i<=n;i++){
            temp.add(i);
            slove(i+1,n,k,list,temp);
            temp.remove(temp.size()-1);
        }
        return ;
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        slove(1,n,k,list,temp);
        return list;
    }
}