class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Queue<Integer[]> pq=new PriorityQueue<>((a,b)->{return Integer.compare(a[1],b[1]);});
        
        //Min-Heap: The queue will keep the array with the lowest value at index 1 at the top.
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.putIfAbsent(nums[i],0);
            map.put(nums[i], map.get(nums[i])+1);
        }

        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            Integer [] item = new Integer [] {e.getKey(),e.getValue()};
            pq.add(item);

        //you add the item and if size > k, than remove it. This order add and than remove -- matters. 
        if (pq.size() > k) {
            pq.poll();
        }
        }

        int [] ans = new int[k];
        for (int i = 0; i<k; i++) {
            ans[i] = pq.poll()[0];
        }
        return ans;
    }
}