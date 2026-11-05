class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(Integer e : nums){
            h.put(e,h.getOrDefault(e,0)+1);

        }
        int[]s=h.entrySet().stream().sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed()).limit(k).mapToInt(g->g.getKey()).toArray();
      return s ;  
    }
}
