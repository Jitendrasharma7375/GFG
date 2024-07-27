//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input1 = sc.nextLine();
            Scanner ss1 = new Scanner(input1);
            while (ss1.hasNextInt()) {
                arr.add(ss1.nextInt());
            }
            Solution ob = new Solution();
            int res = ob.findKRotation(arr);
            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findKRotation(List<Integer> nums) {
        // Code here
        int ans=Integer.MAX_VALUE,index=0;
        int low=0,high=nums.size()-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums.get(low)<=nums.get(high)){
                if(nums.get(low)<ans){
                    index=low;
                    ans=nums.get(low);
                }
                break;
            }
            if(nums.get(low)<=nums.get(mid)){
               if(nums.get(low)<ans){
                   ans=nums.get(low);
                   index=low;
               }
                low=mid+1;
            }else {
               if(nums.get(mid)<ans){
                   ans=nums.get(mid);
                   index=mid;
               }
                high=mid-1;
                }
        }
        return index;
    }
}