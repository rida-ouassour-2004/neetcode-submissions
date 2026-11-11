class Solution {
    
    int[] bs(int[] n, int z, int a, int b) {
        if (a > b) {
            return new int[]{-1};
        }
         
        int m = a + (b - a) / 2;
       
        if (n[m] == z) {
            return new int[]{m};
        }
        if (z < n[m]) {
            return bs(n, z, a, m - 1);
        }
        return bs(n, z, m + 1, b);
    }

    public int[] twoSum(int[] n, int t) {
        for (int i = 0; i < n.length; i++) {
            int z = t - n[i];
            
            int[] g = bs(n, z, i + 1, n.length - 1);
       
            if (g[0] != -1) {
               
                return new int[]{i + 1, g[0] + 1};
            }
        }
        return new int[]{};
    }
}
