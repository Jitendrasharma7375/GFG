//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter ot = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String s[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int a[] = new int[n];
            s = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);
            List<List<Integer>> ans = new Solution().CombinationSum2(a, n, k);
            for (List<Integer> list : ans) {
                for (int x : list) ot.print(x + " ");
                ot.println();
            }
            if (ans.size() == 0) ot.println();
        }
        ot.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public void findComb(int arr[],int idx,int n,int k,List<List<Integer>> ans,List<Integer> list){
        if(k==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(idx==n || k < 0) return;
        
        for(int i = idx; i<n; i++){
            if(i>idx && arr[i]==arr[i-1])continue;
            if(arr[i]>k)  return;//as we are decr k again and again, we should return if currentElem > k
            list.add(arr[i]);
            findComb(arr,i+1,n,k-arr[i],ans,list);
            list.remove(list.size()-1);
        }
        return;
    }
    
    public List<List<Integer>> CombinationSum2(int arr[], int n, int k) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        findComb(arr,0,n,k,ans,new ArrayList<>());
        return ans;
    }
}
