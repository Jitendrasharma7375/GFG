//{ Driver Code Starts
//Initial Template for JAVA

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            
            ArrayList<Integer> arr = new ArrayList<>();
            
            for(int i=0; i<n; i++)
                arr.add(Integer.parseInt(S[i]));

            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> res = ob.uniquePerms(arr,n);
            for(int i=0; i<res.size(); i++)
            {
                for(int j=0; j<n; j++)
                {
                    System.out.print(res.get(i).get(j) + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
        
        return permuteUnique(arr);
    }
    public static ArrayList<ArrayList<Integer>> permuteUnique(ArrayList<Integer> arr) {

        // string wala permutations  ke trah he hai.
        Collections.sort(arr);
        
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        
        permutations(arr,ans,l2);
        return ans;
    }
    public static void permutations(ArrayList<Integer> l1,ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> l2)
    {
        if(l1.size()==0)
        {
            ans.add(new ArrayList<>(l2));
        }
        for(int i=0;i<l1.size();i++)
        {
            if(i>0 && l1.get(i-1)==l1.get(i))
                continue;
            int num=l1.get(i);
            
            l2.add(num);
            l1.remove(i);      // removing index which one picked.
            
            permutations(l1,ans,l2);
            
            l2.remove(l2.size()-1);
            l1.add(i,num);       // inserting num that was removing 
        }
    }
}