package com.leetcode.arrays;

public class DesignParkingSystem {

    //    https://leetcode.com/problems/design-parking-system/
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    int big;
    int medium;
    int small;

    public DesignParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {

        if (carType == 1 && big > 0) {
            big--;
            return true;
        } else if (carType == 2 && medium > 0) {
            medium--;
            return true;
        } else if (carType == 3 && small > 0) {
            small--;
            return true;
        }
        return false;

    }
}
