class Solution {
    public int romanToInt(String s) {
        HashMap<String,Integer> h=new HashMap<>();
        Object[][] l ={{"I",1},{"V",5},{"X",10},{"L",50},{"C",100},{"D",500},{"M",1000},{"IV",4},{"IX",9},{"XL",40},{"XC",90},{"CD",400},{"CM",900},{"a",0}};

for(Object[] p : l){
    h.put((String)p[0],(Integer)p[1]);
}
String[] c = s.split("");
int count=0;
int count2=0;

for(int i=0;i<s.length()-1;i++){
 StringBuilder sb = new StringBuilder();
sb.append(c[i]);
sb.append(c[i+1]);
String resultat = sb.toString();
 if(h.containsKey(resultat)){
    count+=h.get(resultat);
    c[i]="a";
    c[i+1]="a";
 }


 }
 for( String e : c){
    count2+=h.get(e);
 }
 System.out.println(count) ;
 return count+count2;
}


        
    }
