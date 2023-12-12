//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String inline[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(inline[0]);
            int m = Integer.parseInt(inline[1]);
            String inline1[] = in.readLine().trim().split("\\s+");
            int M[][] = new int[n][m];
            for(int i = 0;i < n*m;i++){
                M[i/m][i%m] = Integer.parseInt(inline1[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.maxGold(n, m, M));
        }
    }
} 
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maxGold(int n, int m, int M[][])
    {
        // code here
         int[][] memo = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(memo[i], -1); 
        }

        int maxGold = 0;
        for (int i = 0; i < n; i++) {
            maxGold = Math.max(maxGold, helper(M, i, 0, memo));
        }
        return maxGold;
    }

    static int helper(int M[][], int r, int c, int[][] memo) {
        if (r < 0 || c < 0 || r >= M.length || c >= M[0].length) {
            return 0;
        }

        
        if (memo[r][c] != -1) {
            return memo[r][c];
        }

      
        memo[r][c] = M[r][c] + Math.max(Math.max(helper(M, r + 1, c + 1, memo),
                                                 helper(M, r - 1, c + 1, memo)),
                                        helper(M, r, c + 1, memo));
        return memo[r][c];
    }
}