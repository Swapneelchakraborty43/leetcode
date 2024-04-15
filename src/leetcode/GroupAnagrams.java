package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static List<List<String>> groupAnagrams(String[] strs) {

		Map<String, List<String>> map = new HashMap<String, List<String>>();
		ArrayList<String> arr = new ArrayList<String>();

		for (String s : strs) {

			char[] c = s.toCharArray();
			Arrays.sort(c);
			String sorted_s = new String(c);
			
			if(!map.containsKey(sorted_s)) {
				map.put(sorted_s, new ArrayList());
			}
		
				map.get(sorted_s).add(s);
			
		
			
			System.out.print(" " + sorted_s + " ");
//			System.out.print(s);
		}
		System.out.println();
		System.out.println(map);
		System.out.println(map.values());
//		System.out.println();
//		System.out.println("ArrayList result:" + arr);
		
//		Iterator<String> iter = arr.iterator();
		
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//			
//			if(!map.containsKey(iter.next())) {
//				
//				map.put(iter.next(),new ArrayList<String>());
//				
//				map.get(iter.next()).add(iter.next());
//				
//			
//		}
//		}
//		System.out.println(map);
		
		return new ArrayList<List<String>>(map.values());
	}

	public static void main(String[] args) {

		String strs[] = new String[] { "eat", "tea", "tan", "ate", "nat", "bat" };

		groupAnagrams(strs);
	}

}
