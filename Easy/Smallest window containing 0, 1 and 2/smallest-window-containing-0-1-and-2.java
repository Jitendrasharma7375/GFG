//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            int ans = ob.smallestSubstring(S);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int smallestSubstring(String s) {
        // Code here
        int ans=Integer.MAX_VALUE;
        int zero=-1;int one=-1;int two=-1;
        for (int i=0;i<s.length();i++) 
        {
            if(s.charAt(i)=='0') 
                zero=i;
            else if(s.charAt(i)=='1') 
                one=i;
            else if(s.charAt(i)=='2') 
                two=i;
            if(zero!=-1 && one !=-1 && two !=-1) 
            {
                ans=Math.min(ans,i+1-Math.min(zero,Math.min(one,two)));
            }
        }
        ans = ans==Integer.MAX_VALUE ? -1 : ans;
        return ans;
    }
};
