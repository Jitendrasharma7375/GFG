//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
{
	public static void main (String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int tc=Integer.parseInt(br.readLine().trim());
	 
	 while(tc-- >0)
	 {
	     String line=br.readLine().trim();
	     
	     Solution obj = new Solution();
	     
	     System.out.println(obj.getMaxOccuringChar(line));
	     
	 }
	 }
}
// } Driver Code Ends
class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        int arr[]=new int[26];
        Arrays.fill(arr,0);
        for(int i=0;i<line.length();i++)
        {
            int ch=line.charAt(i);
            int num=0;
            num=ch-'a'; 
            arr[num]++;
        }
        int max=arr[0];
        int ans=0;
        for(int i=0;i<26;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
                ans=i;
            }
        }
        int finalAns=ans+'a';
        return (char) finalAns;
    }
    
}