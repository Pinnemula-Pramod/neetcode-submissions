class Solution {
    public void slove( int can[],int ind,List<List<Integer>> list,List<Integer> temp, int tar){
        if(tar==0){
            list.add( new ArrayList<>(temp));
            return;
        }
        for(int i=ind;i<can.length;i++){
            if(i>ind && can[i]==can[i-1]) continue;
            if(can[i]>tar) break;
            if(can[i]<=tar){
                temp.add(can[i]);
                slove(can,i+1,list,temp,tar-can[i]);
                temp.remove(temp.size()-1);
            }
        }
    }
    public List<List<Integer>> combinationSum2(int[] can, int tar) {
        List<List<Integer> > list = new ArrayList<>();
        List<Integer> temp= new ArrayList<>();
        Arrays.sort(can);
        slove(can,0,list,temp,tar);
        return list;
    }
}
