class Solution {
  public int slove(int nums[],int ind,int xox){
    if(ind==nums.length){
      return xox;
    }
    int ele=nums[ind];
    int take=slove(nums,ind+1,xox^ele);
    int nottake=slove(nums,ind+1,xox);

    return take+nottake;
  }
    public int subsetXORSum(int[] nums) {
        return slove(nums,0,0);
    }
}