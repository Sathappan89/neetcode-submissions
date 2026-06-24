class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    
    Queue<Integer[]> pq = new PriorityQueue<>( (a,b)-> {return Integer.compare(a[1],b[1]);} );
    
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<nums.length;i++){
        map.putIfAbsent(nums[i], 0);
        map.put(nums[i], map.get(nums[i])+1);
    }

    for(Map.Entry<Integer,Integer> e: map.entrySet()){
        Integer[] items = new Integer[] {e.getKey(),e.getValue()};
        pq.add(items);

        if(pq.size()>k){
            pq.poll();
        }
    }

    int [] ans = new int[k];
    for(int i=0;i<k;i++){
        ans[i]=pq.poll()[0];
    }
    return ans;
    }
}