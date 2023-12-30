//{ Driver Code Starts
import java.util.*;
class Triplets{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Solution g=new Solution();
			if(g.findTriplets(a,n))
				System.out.println("1");
			else
				System.out.println("0");
			
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/


class Solution {
    // arr[]: input array
    // n: size of the array
    // Function to find triplets with zero sum.
    public boolean findTriplets(int arr[], int n) {
        Arrays.sort(arr); // Sort the array

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            int target = -arr[i]; // To find triplets with zero sum, arr[i] + arr[left] + arr[right] should be 0

            while (left < right) {
                int sum = arr[left] + arr[right];

                if (sum == target) {
                    // Triplet found
                    return true;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        // No triplet found
        return false;
    }
}