package com.leetcode.stack;

import java.util.Stack;

public class LargestRectangleInHistogram {
    //    https://leetcode.com/problems/largest-rectangle-in-histogram/
    //Time complexity: O(n)
    //Space complexity: O(n)
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() &&
                    (i == n || heights[stack.peek()] >= heights[i])) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        return maxArea;
    }
}
