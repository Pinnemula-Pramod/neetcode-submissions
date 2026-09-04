class Solution {
    public void slove(int nums[],List<List<Integer>> list ,List<Integer> temp,boolean used[]){
        if(temp.size()==nums.length){
            list.add(new ArrayList<>(temp));
            return ;
        }
       // if(ind==nums.length) return;
        for(int i=0;i<nums.length;i++){
         if(used[i]) continue;
         temp.add(nums[i]);
         used[i]=true;
         slove(nums,list,temp,used);
        // used[i]=true;
         temp.remove(temp.size()-1);
         used[i]=false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        boolean used[]= new boolean[nums.length];
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        slove(nums,list,temp,used);
        return list ;
    }
}
