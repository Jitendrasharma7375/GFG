//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s1 = br.readLine().trim();
            String[] S1 = s1.split(" ");
            int n = Integer.parseInt(S1[0]);
            int k = Integer.parseInt(S1[1]);
            String s2 = br.readLine().trim();
            String[] S2 = s2.split(" ");
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(S2[i]);
            }
            Solution ob = new Solution();
            boolean ans = ob.canPair(nums, k);
            if (ans)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public boolean canPair(int[] nums, int k) {
      HashSet<Integer>set = new HashSet<>();
        if(nums.length%2!=0) 
        {
            return false;
        }
        
        for(int i = 0 ;i<nums.length;i++) 
        {
            if(set.size()==0&&i>0) 
            {
                return false;
            }
            if(set.contains(i)) 
            {
                continue;
            }
            for(int j = i+1;j<nums.length;j++)
            {
                if((nums[i]+nums[j])%k==0)
                {
                    set.add(i);
                    set.add(j);
                    break;
                }
            }
        }
        return set.size()==nums.length;
    }
}