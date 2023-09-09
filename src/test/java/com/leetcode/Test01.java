package com.leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Test01 {

    @Test
    public void test_01TwoSum(){
        _01TwoSum test = new _01TwoSum();
        int[] ints = test.twoSum(new int[]{1, 2, 3, 4, 5}, 4);
        System.out.println(Arrays.toString(ints));


        int[] ints2 = test.twoSum2(new int[]{1, 2, 3, 4, 5}, 4);
        System.out.println(Arrays.toString(ints2));



    }
}
