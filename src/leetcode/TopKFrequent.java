package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TopKFrequent {
	
	 public static int[] topKFrequent(int[] nums, int k) {
		 
		 Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		 
		 for(int i=0; i<nums.length;i++) {
			 System.out.println(nums[i]);
			 
			 
			 if(map.containsKey(nums[i])) {
				 map.put(nums[i],map.get(nums[i])+1);
				 
			 }else {
				 map.put(nums[i],1);
			 }
			 
			 System.out.println(map);
			 //map.put(nums[i],1);
		 }
		 
		 List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
		 
		 Comparator c = new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				// TODO Auto-generated method stub
				return (o1.getValue()).compareTo(o2.getValue());
			}
		};
		Collections.sort(list, c);
		 System.out.println(list);
		
		int res[] = new int[k];
		
		 for(int i=0;i<k;i++) {
			 res[i] = (Integer)list.get(list.size()-i-1).getKey();
		 }
		
	       return res; 
	    }

	public static void main(String[] args) {
		int[] nums = {1,1,1,2,2,2,3,0};
		
		
		topKFrequent(nums, 1);

	}

}
