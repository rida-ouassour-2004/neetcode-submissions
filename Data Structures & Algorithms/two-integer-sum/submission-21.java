class Solution {
    public int[] twoSum(int[] nums, int target) {
      int[] output=new int[2];
      Map<Integer,Integer> m = new HashMap<>();
      for(int i=0 ;i<nums.length ;i++){
      int c =target-nums[i];
      if (m.containsKey(c)){
        if(i<m.get(c)){
        output[0]=i;
        output[1]=m.get(c);}
        else{
          output[1]=i;
        output[0]=m.get(c);
        }
      }
      m.put(nums[i],i);
      
      }

     return output;  
        
}}
