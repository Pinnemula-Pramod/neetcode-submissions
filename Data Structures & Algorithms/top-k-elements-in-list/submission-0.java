class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n= nums.length;
        for(int i=0;i<n;i++){
            int key=nums[i];
            map.put(key,map.getOrDefault(key,0)+1);
        }
        PriorityQueue<int[]>pq= new PriorityQueue<>((a,b)->(b[1]-a[1]));
        for(int key :map.keySet()){
            pq.add(new int[]{key,map.get(key)});
        }
        int ans[]= new int[k];
        int i=0;
        while(k>0){
            ans[i++]=pq.poll()[0];
            k--;
        }
        return ans;
    }
}