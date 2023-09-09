package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _01TwoSum {
    public static void main(String[] args) {


    }

    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    /*
    * HashTable 哈希表
    *  1、将值和索引放入Map中
    *  2、通过目标值与
    * */
    public int[] twoSum2(int[] nums, int target) {

        Map<Integer, Integer> hashTable = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashTable.containsKey(target - nums[i])) {    // {1,4,5,3,2,6,7}   {11}
                return new int[]{hashTable.get(target - nums[i]), i};
            }
            hashTable.put(nums[i], i);
        }
        return new int[0];
    }
}
