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
            String S=read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.DivisibleByEight(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int DivisibleByEight(String s){
        //code here
        
        int n = s.length();
        int res = 0;
        if(n < 3) {
            res = Integer.parseInt(s.substring(0,n));
            if(res % 8 == 0) 
                return 1;
        }
        
        res = Integer.parseInt(s.substring(n-3,n));
        if(res % 8 == 0)
            return 1;
        return -1;
    }
}