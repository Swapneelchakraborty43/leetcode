package leetcode;

import java.util.HashMap;

public class ContainsDuplicate {

	public static boolean containsDuplicate(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			
			if(map.containsKey(nums[i])) {
				return true;
			}
			map.put(nums[i], i);
			//System.out.println(map);
			//System.out.println(map.containsKey(nums[i]));
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		Boolean res = containsDuplicate(nums);
		System.out.println(res);

	}

}
