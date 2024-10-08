//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            int[] A = new int[N];
            
            for(int i=0 ; i<N ; i++)
                A[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.gameOfXor(N,A));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int gameOfXor(int N , int[] A) {
        // code here
        int ans = 0;
        for (int i = 0; i < A.length; i++) {
            int contri = (i + 1) * (A.length - i);
            if (contri % 2 == 1) {
                ans ^= A[i]; // Use XOR operator instead of multiplication
            }
        }
        return ans;
    }
};