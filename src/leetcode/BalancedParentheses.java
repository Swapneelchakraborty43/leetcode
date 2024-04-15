//Leetcode day 12 challenge
package leetcode;

import java.util.HashMap;
import java.util.Stack;

public class BalancedParentheses {

	public static boolean isValid(String s) {

//****************** My solution **************************
//		Stack<Character> st = new Stack();
//		HashMap mp = new HashMap();
//		Boolean res = false;
//
//		char[] sarr = s.toCharArray();
//
//		for (char c : sarr) {
//			System.out.println("c=" + c);
//			if (c == '{' || c == '(' || c == '[') {
//
//				st.push(c);
//			}
//
//			if (st.isEmpty()) {
//				return false;
//			}
//			char see;
//
//			if (c == '}') {
//				see = st.pop();
//				System.out.println("pop=" + see);
//				if (see == '{') {
//					System.out.println("condition for }");
//					res = true;
//
//				} else {
//					return false;
//				}
//			} else if (c == ')') {
//				see = st.pop();
//				System.out.println("pop=" + see);
//				if (see == '(') {
//					System.out.println("condition for )");
//					res = true;
//				} else {
//
//					return false;
//				}
//			} else if (c == ']') {
//				see = st.pop();
//				System.out.println("pop=" + see);
//				if (see == '[') {
//					System.out.println("condition for ]");
//					res = true;
//				} else {
//					return false;
//				}
//
//			} else {
//				res = false;
//			}
//
//			System.out.println("res=" + res);
//		}
//
//		if (!st.isEmpty()) {
//			res = false;
//		}
//
//		return res;

//****************** Better/cleverer implementation of the same logic***************

//		         Stack<Character> stack = new Stack<>();
//
//		        for (char x : s.toCharArray()
//		             ) {
//
//		            if(x=='('){
//		                
//		                stack.push(')');
//		            } else if (x=='{') {
//		                stack.push('}');
//		                
//		            } else if (x=='[') {
//		                stack.push(']');
//		            } else if (stack.isEmpty() || stack.pop()!=x) {
//
//		                return false;
//		            }
//
//		        }
//
//
//		        return stack.isEmpty();

//*********************** Neetcode approach in java **************************

		HashMap mp = new HashMap();
		mp.put('}', '{');
		mp.put(')', '(');
		mp.put(']', '[');

		Stack<Character> st = new Stack();

		for (char x : s.toCharArray()) {
			if (mp.containsKey(x)) {
				if (!st.isEmpty() && st.peek() == mp.get(x)) {
					st.pop();
				} else {
					return false;
				}
			} else {
				st.push(x);
			}
		}
		if (st.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		String s = "([]";
		boolean valid = isValid(s);
		System.out.println(valid);

	}

}

//Intution to use stack
// if the input is an open bracket push to the stack
// now for each closin bracket check if the top of the stack is a matching open bracket 
// If not return false
// 