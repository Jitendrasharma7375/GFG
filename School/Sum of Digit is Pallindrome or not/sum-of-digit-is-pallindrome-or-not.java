//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isDigitSumPalindrome(int N) {
        // code here
        int x=N;
        int sum=0,ans=0;
        //digit sum
        while(x>0){
            sum=sum+(x%10);
            x=x/10;//11
        }
        int y=sum;
        //reverse of a number
        while(y>0){
            ans=ans*10+(y%10);
            y/=10;
        }
        if(ans==sum){
            return 1;
        }
        return 0;
    }
}