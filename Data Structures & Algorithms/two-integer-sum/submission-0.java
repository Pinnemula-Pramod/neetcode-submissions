class Solution {
    public int[] twoSum(int[] nums, int target) {
         HashMap<Integer,Integer> map = new HashMap<>();
        int ans[]=new int[2];
        int n=nums.length;
        for(int i=0;i<n;i++){
            int val=nums[i];
            int k=target-val;
            if(!map.isEmpty() && map.containsKey(k)){
                ans[0]=map.get(k);
                ans[1]=i;
            }
             map.put(val,i);
        }
        return ans;
    }
}
