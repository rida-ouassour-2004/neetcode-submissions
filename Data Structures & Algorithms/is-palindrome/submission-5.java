class Solution {
    public boolean isPalindrome(String s) {
        char [] c = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","").toCharArray();
        System.out.println(c);
        int a=0;
        int b=c.length-1;
        if(c.length==0 || c.length==1){
            return true;
        }

for(int i=0;i<c.length;i++){

if(c[a]==c[b]&& (c.length)%2!=0){
    a++;
    b--;
    if(a==b){return true;}
}
if(c[a]==c[b]&& (c.length)%2==0){
    a++;
    b--;
    if(b==(c.length/2)-1 && a==c.length/2){return true;}
}
}
return false;


}
        
    }

