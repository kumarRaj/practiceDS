package com.sunandan.leetcode;

public class HouseRobber {

    public int rob(int[] nums) {
        int ifCurrentPreviousRobbed = 0;
        int ifCurrentPreviousNotRoobed = 0;

        for (int i = 0; i < nums.length; i++) {

            int currRoobed = ifCurrentPreviousNotRoobed + nums[i];
            int cuurentNotRobbed = Math.max(ifCurrentPreviousRobbed, ifCurrentPreviousNotRoobed);

            ifCurrentPreviousRobbed = currRoobed;
            ifCurrentPreviousNotRoobed = cuurentNotRobbed;
        }

        return Math.max(ifCurrentPreviousRobbed, ifCurrentPreviousNotRoobed);
    }

}
