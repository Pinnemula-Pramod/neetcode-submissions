class Solution {
     public  void slove(int nums[],int ind,List<List<Integer>> list ,List<Integer> temp,int target){
         if(target==0){
            list.add( new ArrayList<>(temp));
            return;
            }
        if(ind==nums.length || target<0){
            return;
            
        }
        temp.add(nums[ind]);
        slove(nums,ind,list,temp,target-nums[ind]);
        temp.remove(temp.size()-1);
        slove(nums,ind+1,list,temp,target);
        return;
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
         List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
         slove(nums,0,list,temp,target);
         return list;
    }
}
