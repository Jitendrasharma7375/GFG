//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            int ans = ob.rectanglesInCircle(N);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int rectanglesInCircle(int r) {
        // code here
        
        int count = 0;
        int limit = 2 * r;  // Maximum possible dimension for width and height
    
        // Iterate through all possible widths and heights
        for (int w = 1; w <= limit; ++w) {
            for (int h = 1; h <= limit; ++h) {
                // Check if the rectangle can fit inside the circle
                if (w * w + h * h <= 4 * r * r) {
                    ++count;
                }
            }
        }

    return count;
    }
};