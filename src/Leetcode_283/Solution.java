package Leetcode_283;

public class Solution {
    public void moveZeroes(int[] nums) {
//        int l = 0;
//        int num = nums.length;
//        for (int i = 0; i < num ; i++) {
//            if (nums[i] != 0){
//                nums[l] = nums[i];
//                l++;
//            }else{
//                nums[l] = nums[i];
//                l++;
//                num++;
//            }
        int l = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != l) {
                    nums[l] = nums[i];
                    nums[i] = 0;
                }
                l++;
            }

        }
    }
}



