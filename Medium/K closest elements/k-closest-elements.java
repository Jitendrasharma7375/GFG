//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);

            int[] ans = new Solution().printKClosest(arr, n, k, x);
            for (int xx : ans) {
                System.out.print(xx + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int binarySearch(int[] arr, int low, int high, int x) {
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == x)
                return mid;
            else if(arr[mid] < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        
        return low;
    }
    
    int[] printKClosest(int[] arr, int n, int k, int x) {
        int position = binarySearch(arr, 0, n - 1, x);
        int left = position - 1, right = position, i = 0;
        int[] res = new int[k];
        
        if(right < n && arr[right] == x)
            right++;
        
        while(k > 0 && left >= 0 && right < n) {
            int leftDiff = Math.abs(arr[left] - x);
            int rightDiff = Math.abs(arr[right] - x);
            
            if(leftDiff < rightDiff) 
                res[i++] = arr[left--];
            
            else if(leftDiff > rightDiff) 
                res[i++] = arr[right++];
            
            else {
                if(arr[right] > arr[left]) 
                    res[i++] = arr[right++];
                else 
                    res[i++] = arr[left--];
            }
            
            k--;
        }
        
        while(k > 0 && left >= 0) {
            res[i++] = arr[left--];
            k--;
        }
        
        while(k > 0 && right < n) {
            res[i++] = arr[right++];
            k--;
        }
            
        return res;
    }
}