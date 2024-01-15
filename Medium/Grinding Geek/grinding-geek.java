//{ Driver Code Starts
import java.util.*;
import java.io.*;

public class GFG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0)
        {
            int n = scanner.nextInt();
            int total = scanner.nextInt();
            int[] cost = new int[n];
            for (int i = 0; i < n; i++) {
                cost[i] = scanner.nextInt();
            }
            Solution solution = new Solution();
            int result = solution.max_courses(n, total, cost);
            System.out.println(result);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution {
    public int max_courses(int n, int total, int[] cost) {
        // code here
         int[][] dp = new int[n+1][total + 1];
        for (int sum=1;sum<=total;++sum) {
            for (int index = n-1; index >=0 ; index--) {
                int purchase = 0, notPurchase = 0;
                if (cost[index] <= sum) {
                    purchase = 1 + dp[index+1][sum - cost[index] + (cost[index] * 9) / 10];
                }
                notPurchase = dp[index+1][sum];

                dp[index][sum] = Math.max(purchase, notPurchase);
            }
        }
        return dp[0][total];
    }
}

