package leetcode;

import java.util.HashMap;
import java.util.Map;

public class twoSum {
	
	public static int[] twoSum(int[] nums, int target) {
		int[] res = new int[2];
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0; i<nums.length; i++) {
			int cur = nums[i];
			int x = target - cur;
			System.out.println(x);
			
			if(map.containsKey(x)) {
				
			res[0] = i;
			res[1] = map.get(x);
			
			return res;
			}else {
				
				map.put(cur, i);
				System.out.println(map);
			}
		}	
	return null;
	}

	public static void main(String[] args) {
		int[] nums1 = {2,7,11,15};
		int t = 9;
		int[] sum = twoSum(nums1,t);
		System.out.println(sum[0]);

	}

}

//cur + x = target;
//x = target - cur;
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].