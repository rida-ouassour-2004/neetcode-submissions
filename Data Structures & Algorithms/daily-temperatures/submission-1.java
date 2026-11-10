class Solution {
    public int[] dailyTemperatures(int[] t) {
        Deque<Integer> d = new ArrayDeque<>();
        int[] z=new int[t.length];
        for(int i=0 ;i<t.length;i++){
        int e=0;
            for(int j=i+1 ;j<t.length;j++){
                if(t[j]<=t[i] && j==t.length-1){
                 e=0;
                }
            else if(t[j]<=t[i]){    
             e++;
            }else{
                e++;
                break;
            }
           }
           z[i]=e;
           }
           return z ;
           
           
           
            
        }
    }

