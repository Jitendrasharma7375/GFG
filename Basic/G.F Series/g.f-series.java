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
			
            Solution ob = new Solution();
            ob.gfSeries(N);
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static void gfSeries(int N){
        // code here
        long t1=0;
        long t2=1;
        System.out.print(t1+" "+t2+" ");
        recursion(N-2,t1,t2);
        
    }
    static void recursion(long N,long t1,long t2)
    {
        if(N==0)
        {
            System.out.println();
            return;
        }
        Long t3=(t1*t1)-t2;
        System.out.print(t3+" ");
        recursion(N-1,t2,t3);
    }
}