package Leetcode_169;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] nums) {
//      Map<Integer, Integer> mp = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            mp.put(nums[i],mp.getOrDefault(nums[i] ,0) +1 );
//            Arrays.sort(nums);
//            int count = mp.get(nums[i]);
//            int major = nums.length / 2;
//           if (count > major){
//               return nums[i];
//
//           }
//
//
//            }
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
            // Arrays.sort(nums);

            int count = mp.get(nums[i]);
            int major = nums.length / 2;
            if (count > major) {
                return nums[i];

            }


        }

        return -2;
    }
}



