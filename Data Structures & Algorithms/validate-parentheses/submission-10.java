class Solution {
 public   char inv(char d){
    if(d==')'){
        return '(';
    }
     if(d=='}'){
        return '{';
    }
     if(d==']'){
        return '[';
    }
    return d ; }
   
    public boolean isValid(String s) {
    Deque<Character> z=new ArrayDeque<>();
    HashSet<Character> s1 =new HashSet<>(List.of('}',')',']'));
    HashSet<String> s2 = new HashSet<>(List.of("[}","{]","(]","[)","(}","{)"));
    char [] ns= s.toCharArray();

    for(int i =0;i<s.length()-1;i++){
StringBuilder g = new StringBuilder();
g.append(ns[i]);
g.append(ns[i+1]);
if(s1.contains(ns[0])){
    return false;
}
if(s2.contains(g.toString())){
    return false ;
}
}

    for(char e : ns){
        if(s1.contains(e) && !z.isEmpty() ){
            if(!(inv(e)==z.peek())){
                return false;
            }
            z.pop();
        }
        else{
        z.push(e);
        }
       


    }


    if(z.isEmpty()){
    return true ;
    }
     return false;
    }}
