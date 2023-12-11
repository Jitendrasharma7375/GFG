//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            
            int N=sc.nextInt();
            int K=sc.nextInt();
            ArrayList<Integer> Arr = new ArrayList<Integer>(N); 
  
            // Appending new elements at 
            // the end of the list 
            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                Arr.add(x); 
            }

            Solution ob = new Solution();
            System.out.println(ob.maximumSumSubarray(K,Arr,N));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        long sum = 0;
        long max = 0;
        int temp = K-1;
        int loop = N-K+1;
        for(int i =0; i<K; i++){
            sum+=Arr.get(i);
        }
        max = sum;
        for(int i =1; i<loop; i++){
            sum = sum - Arr.get(i-1);
            sum = sum + Arr.get(temp+i);
            if(sum>max){
                max = sum;
            }
        }
        return max;
    }
}