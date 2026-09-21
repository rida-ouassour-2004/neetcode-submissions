class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> carac1 = new HashMap<>();
         HashMap<Character,Integer> carac2 = new HashMap<>();
char[] a=s.toCharArray();
char[] d=t.toCharArray();
        for(char c : a){
         carac1.put(c,carac1.getOrDefault(c,0)+1);
        }
        for(char b : d){
         carac2.put(b,carac2.getOrDefault(b,0)+1);
        }
         if(carac1.equals(carac2)){return true;}else{return false;}  


    }
}
