//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] mat = new int[n][n];
            String[] S = br.readLine().trim().split(" ");
            int i = 0;
            int j = 0;
            for(int k = 0; k < S.length; k++){
                mat[i][j] = Integer.parseInt(S[k]);
                j++;
                if(j == n){
                    i++;
                    j = 0;
                }
            }
            Solution obj = new Solution();
            int[] ans = obj.matrixDiagonally(mat);
            for(int it = 0; it < ans.length; it++){
                System.out.print(ans[it] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public int[] matrixDiagonally(int[][] mat) {
        int n=mat.length*mat.length;
        int ans[]=new int[n];
        int idx=0;
        
        boolean flag=true;
        for(int i=0;i<mat.length;i++){
            
            for(int j=0,k=i;j<=i;j++,k--){
                if(flag==false)ans[idx++]=mat[j][k];
                else ans[idx++]=mat[k][j];
            }
            flag=!flag;
        }
        
        for(int i=1;i<mat.length;i++){
            
            for(int j=i,k=mat.length-1;j<mat.length;j++,k--){
                if(flag==false)ans[idx++]=mat[j][k];
                else ans[idx++]=mat[k][j];
            }
            flag=!flag;
        }
        
        return ans;
    }
}