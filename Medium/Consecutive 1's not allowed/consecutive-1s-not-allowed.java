//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            long ans = new Solution().countStrings(n);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long countStrings(int N) {
        // code here
        final int MOD = 1000000007;
        int[] count = new int[N + 1];
        int[] countOnes = new int[N + 1];

        count[1] = 1;
        countOnes[1] = 1;

        for (int i = 2; i <= N; i++) {
            count[i] = (count[i - 1] + countOnes[i - 1]) % MOD;
            countOnes[i] = count[i - 1];
        }

        return (count[N] + countOnes[N]) % MOD;
    }
}