class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count=1;
        int val=nums[0];
        for(int i=1;i<n;i++){
            if(val==nums[i]){
                count++;
            }else{
                count--;
            }
            if(count==0){
                val=nums[i];
                count=1;
            }
        }
        return val;
    }
}