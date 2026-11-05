class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Integer,List<String>> m = new HashMap<>();
        for(String f :strs){
            char [] c =f.toCharArray();
            java.util.Arrays.sort(c);
            String s=new String(c);
            m.computeIfAbsent(s.hashCode(),k->new ArrayList<>()).add(f);
            
           
           
        }
       

                    return new ArrayList<>(m.values());

        
    }
}
