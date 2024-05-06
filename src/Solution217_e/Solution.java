package Solution217_e;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums){
        Set<Integer> copy = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (copy.add(nums[i])){
                return false;
            }
        }

        return true;

        }


    }


