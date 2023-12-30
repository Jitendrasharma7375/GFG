//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int r=-1;
        long s=0;
        for(int i=0;i<n;i++)
           s+=arr[i];
        for(int i=0;i<n;i++)
        {
            int t=Math.abs(arr[i]);
            if(arr[t-1]<0)
            {
                r=t;
                break;
            }
            else
            {
                arr[t-1]=arr[t-1]*(-1);
            }
        }
        long m;
        if(n%2==0)
        {
            m=(n/2)*(n+1);
        }       
        else
           m=((n+1)/2)*n;
        long p=m-s+r;
        return new int[]{r,(int)(p)};
    }
}