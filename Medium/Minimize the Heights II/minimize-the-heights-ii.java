//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().getMinDiff(arr, n, k);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        int min  =0 , max = 0 , r = 0;
        Arrays.sort(arr);
        r = arr[n-1]- arr[0];
        for(int i = 1; i<n; i++){
            if(arr[i]>k){
                max = Math.max(arr[i-1]+k, arr[n-1]-k);
                min = Math.min(arr[i]-k, arr[0]+k);
                r = Math.min(r, max- min);
            }
            else{
                continue;
            }
        }
        return r;

    }
}
