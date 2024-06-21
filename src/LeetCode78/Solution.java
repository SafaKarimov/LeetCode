package LeetCode78;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        explore(subsets, new ArrayList<>(), nums, 0);
        return subsets;
    }

    private void explore(List<List<Integer>> subsets, List<Integer> current, int[] nums, int index) {

        subsets.add(current);

        for (int i = index; i < nums.length; i++) {

            List<Integer> newSubset = new ArrayList<>(current);
            newSubset.add(nums[i]);

            explore(subsets, newSubset, nums, i + 1);
        }
    }

}