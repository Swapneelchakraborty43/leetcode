package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

	public static int longestConsecutive(int[] nums) {
//			int n = nums.length;
//			int count = 1;
//			int res=0;
//	
//			HashSet<Integer> countFreq = new HashSet<Integer>();
//	
//			HashSet<Integer> numsSet = new HashSet<Integer>();
//			for (int i : nums) {
//				numsSet.add(i);
//			}
//			
//		ArrayList<Integer> arr = new ArrayList<Integer>(numsSet);
//		Collections.sort(arr);
//		
//			
//			
//			if(arr.isEmpty()) {
//				count = 0;
//			}
//			
//			if(arr.size()==1) {
//				res=1;
//			}
//			
//	
//			for(int ele : arr) {
//				
//				if(arr.contains(ele+1)) {
//					count++;
//					countFreq.add(count);
//				}else {
//					count=1;
//					res=1;
//				}
//			
//			}
//			
//			if(!countFreq.isEmpty()) {
//			res = Collections.max(countFreq);
//			}

		// System.out.println(res);

		HashSet<Integer> numsSet = new HashSet<Integer>();
		for (int i : nums) {
			numsSet.add(i);
		}

		int longest = 0;
		int length = 0;

		for (int i : nums) {
			if (!numsSet.contains(i - 1)) {
				length = 0;
				while (numsSet.contains(i + length)) {
					length += 1;
				}
				longest = Math.max(longest, length);

			}
		}
		return longest;

	}

	public static void main(String[] args) {

		int nums[] = { -6, -1, -1, 9, -8, -6, -6, 4, 4, -3, -8, -1 };
		int count = longestConsecutive(nums);

		System.out.println("res " + count);
	}

}
