package com.waterfrog.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wangwanru on 16/10/14.
 *
 * 找出集合的子集
 */
public class SubSets {
    private static void dfs(int[] nums,int pos,List<Integer> list,List<List<Integer>> ret){
        ret.add(new ArrayList<Integer>(list));

        for (int i = pos; i < nums.length; i++) {
            list.add(nums[i]);
            dfs(nums, i + 1, list, ret);
            list.remove(list.size() - 1);
        }
    }

    private static List<List<Integer>> getSubSets(int[] nums){
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        if (nums == null || nums.length == 0) {
            return result;
        }

        Arrays.sort(nums);
        dfs(nums, 0, list, result);

        return result;
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,2,3};
        System.out.println(getSubSets(nums));
    }
}
