class Solution {
    public void slove(int nums[],int ind,List<List<Integer>> list ,
     List<Integer> temp ){
        //if(ind==nums.length){
            list.add(new ArrayList<>(temp));
          //  return;
       // }
        for(int i=ind;i<nums.length;i++){
            if(i>ind && nums[i]==nums[i-1]) continue;
            temp.add(nums[i]);
            slove(nums,i+1,list,temp);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        slove(nums,0,list,temp);
        return list;
    }
}
