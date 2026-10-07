class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        int n=nums.length;
       int  i=0;
       while(i<n){
        int a=nums[i];
        if(a!=val){
            nums[k++]=a;
        }
        i++;
       }
       return k;
    }
}