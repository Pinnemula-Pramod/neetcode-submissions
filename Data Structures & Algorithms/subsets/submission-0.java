class Solution {
    public  void slove(int nums[],int ind,List<List<Integer>> list ,List<Integer> temp){
        if(ind==nums.length){
            list.add( new ArrayList<>(temp));
            return;
        }
        temp.add(nums[ind]);
        slove(nums,ind+1,list,temp);
        temp.remove(temp.size()-1);
        slove(nums,ind+1,list,temp);
        return;
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
         slove(nums,0,list,temp);
         return list;
    }
}
