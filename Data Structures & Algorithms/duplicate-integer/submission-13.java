class Solution {
    public boolean hasDuplicate(int[] nums) {
    HashMap<Integer,Integer> occurence = new HashMap<>();
        for(int i: nums){
          occurence.put(i,occurence.getOrDefault(i,0)+1);
        }
     for(int v : occurence.values()){
       if (v>1){
        return true ;
       }  
     }
     return false;
    }
}