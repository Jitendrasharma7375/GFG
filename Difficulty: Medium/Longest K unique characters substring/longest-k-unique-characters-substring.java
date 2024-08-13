//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        int maxLen=Integer.MIN_VALUE;
        int l=0,r=0;
        int n=s.length();
        Map<Character,Integer>map=new HashMap<>();
        while(r<n){
            char x=s.charAt(r);
            map.put(x,map.getOrDefault(x,0)+1);
            if(map.size()<=k){
                maxLen=Math.max(maxLen,r-l+1);
            }
            if(map.size()>k){
                char c=s.charAt(l);
                int freq=map.get(c);
                map.put(c,freq-1);
                if(map.get(c)==0) map.remove(c);
                l++;
            }
            r++;
        }
        if(map.size()<k)
        return -1;
        return maxLen;
    }
}