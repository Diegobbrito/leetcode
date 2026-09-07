package com.leetcode.arrays;

public class LongestStrictlyIncreasingStrictlyDecreasingSubarray {

//    https://neetcode.io/problems/longest-strictly-increasing-or-strictly-decreasing-subarray/
//    Time complexity: O(n)
//    Space complexity: O(1)

    public int longestMonotonicSubarray(int[] nums) {
        int maxIncrease = 1;
        int maxDecrease = 1;
        int currIncrease = 1;
        int currDecrease = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i - 1]){
                currIncrease++;
                currDecrease = 1;
                maxIncrease = Math.max(maxIncrease, currIncrease);
            } else if(nums[i] < nums[i - 1]){
                currDecrease++;
                currIncrease = 1;
                maxDecrease = Math.max(maxDecrease, currDecrease);
            } else {
                currIncrease = 1;
                currDecrease = 1;
            }
        }

        return Math.max(maxIncrease, maxDecrease);
    }
}
