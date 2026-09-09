package com.leetcode.arrays;

public class IslandPerimeter {

//    https://leetcode.com/problems/island-perimeter/
//    Time complexity: O(n)
//    Space complexity: O(n)

    public int islandPerimeter(int[][] grid) {
        int[] result = new int[1];

        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[0].length; c++){
                if(grid[r][c] == 1){
                    dfs(r,c,grid,result);
                    return result[0];
                }
            }
        }
        return result[0];
    }

    private void dfs(int r, int c, int[][]grid, int[] sum){
        if(r < 0 || r >= grid.length
                || c < 0 || c >= grid[0].length
                || grid[r][c] == 0){
            sum[0]++;
            return;
        }
        if(grid[r][c] == 2) return;
        grid[r][c] = 2;
        dfs(r + 1, c, grid, sum);
        dfs(r, c + 1, grid, sum);
        dfs(r - 1, c, grid, sum);
        dfs(r, c - 1, grid, sum);
    }
}
