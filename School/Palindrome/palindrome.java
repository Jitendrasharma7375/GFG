//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            String ans = ob.is_palindrome(n);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String is_palindrome(int n)
    {
        // Code here
       String s1=Integer.toString(n);
       String s2="";
       for(int i=s1.length()-1;i>=0;i--)
       {
           s2=s2+s1.charAt(i);
       }
       if(s1.equals(s2))
       {
           return "Yes";
       }
       else 
       {
           return "No";
       }
    }
}