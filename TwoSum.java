package main.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		
		int[] els = twoSum(new int[] {3,2,4}, 6);
			System.out.println(Arrays.toString(els));
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i], i);
		}
		for(int i=0;i<nums.length;i++) {
			int firstNumber = nums[i];
			int secNumber = target-firstNumber;
			if(map.containsKey(secNumber) && map.get(secNumber)!=i) {
				return new int[] {i, map.get(secNumber)};
			}
		}
		return new int[] {};
        
    }
}
