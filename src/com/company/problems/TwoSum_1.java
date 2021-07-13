package com.company.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {
    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 13;
        int index_1;
        int index_2;

        Map<String, Boolean> mapList = new HashMap<>();

        mapList.put("sdsds", true);

        System.out.println(Arrays.toString(twoSum(nums, target)));

    }

    private static int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            if (map.containsKey(target - nums[index])) {
                indices[1] = index;
                indices[0] = map.get(target - nums[index]);
                return indices;
            }
            map.put(nums[index], index);
        }
        return indices;
    }
}
