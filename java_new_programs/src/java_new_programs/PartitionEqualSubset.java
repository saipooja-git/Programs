package java_new_programs;

public class PartitionEqualSubset {
	class Solution {
	    static boolean equalPartition(int N, int arr[]) {
	        int sum = 0;
	        for (int num : arr) {
	            sum += num;
	        }
	        
	        // If the sum of elements is odd, we cannot divide it into two equal partitions.
	        if (sum % 2 != 0) {
	            return false;
	        }
	        
	        int targetSum = sum / 2;
	        
	        // Create a DP array dp[i][j] where dp[i][j] is true if there is a subset
	        // of elements from arr[0] to arr[i] with sum equal to j.
	        boolean[][] dp = new boolean[N + 1][targetSum + 1];
	        
	        for (int i = 0; i <= N; i++) {
	            dp[i][0] = true;
	        }
	        
	        for (int i = 1; i <= N; i++) {
	            for (int j = 1; j <= targetSum; j++) {
	                if (arr[i - 1] <= j) {
	                    
	                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
	                } else {
	                    dp[i][j] = dp[i - 1][j];
	                }
	            }
	        }
	        
	        return dp[N][targetSum];
	    }
	}


}
