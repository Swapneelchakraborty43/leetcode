package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
	public static boolean isAnagram(String s, String t) {
		
		Map<Character,Integer> count = new HashMap<Character, Integer>();
		
		for(char a : s.toCharArray()) {
			
			if(count.containsKey(a)) {
				count.put(a, count.get(a)+1);
			}else {
				count.put(a, 0);
			}
		}
		
		System.out.println(count);
		
		for(char b : t.toCharArray()) {
			if(count.containsKey(b)) {
				count.put(b,count.get(b)-1);
			}
		
		}
		
		for(int i : count.values() ) {
			if(i!= -1) {
				return false;
			}
		}
		System.out.println(count);
		return true;
		
	
	}

	public static void main(String[] args) {
		String s = "a";
		String t = "ab";
		
		boolean anagram = isAnagram(s,t);
		System.out.println(anagram);
		
		System.out.println();

	}
}
