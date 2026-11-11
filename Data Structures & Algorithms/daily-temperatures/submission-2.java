class Solution {
    public int[] dailyTemperatures(int[] t) {
        Deque<Integer> d = new ArrayDeque<>();
        int[] s= new int [t.length];
        for(int i=t.length-1 ;i>=0;i--){
            while(!d.isEmpty()&& t[i]>=t[d.peek()] ){
                d.pop();
            }
            if(!d.isEmpty()){
                  int z =d.peek();
                  d.push(i);
                   s[i]=z-i;
            }else{
                d.push(i);
                 s[i]=0;

            }
            
          
           

        
           }
           return s ;
          
           
           
           
            
        }
    }

