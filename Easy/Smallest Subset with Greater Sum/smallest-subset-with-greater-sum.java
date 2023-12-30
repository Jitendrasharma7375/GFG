//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.Collections;


class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t > 0){
            int N = sc.nextInt();
            int[] Arr = new int[N];
            for (int i = 0; i < N; ++i){
                Arr[i] = sc.nextInt();
            }
            Solution ob = new Solution();
            int ans = ob.minSubset(Arr,N);
            System.out.println(ans);
            t--;
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution { 
    int minSubset(int[] arr,int N) { 
        Arrays.sort(arr);
        long ans=0;
        for(int i=0;i<N;i++)
        {
            ans+=arr[i];
        }
        int c=0;
        long dum=0;
        for(int j=N-1;j>0;j--) 
        {
            ans-=arr[j];
            dum+=arr[j];
            c++;
            if(dum>ans)
            {
                return c;
            }
        }
        return 1;
    }
}