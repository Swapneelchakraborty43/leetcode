//Leet code day 12
package leetcode;

import java.util.ArrayList;

public class MinStack {

	ArrayList<Integer> stack = new ArrayList<Integer>();
	ArrayList<Integer> min = new ArrayList<Integer>();

	public MinStack() {

	}

	public void push(int val) {

		stack.add(val);
		if (!min.isEmpty()) {
			min.add(Math.min(val, min.get(min.size() - 1)));//make the comparison correct
		} else {
			min.add(val);
		}
		System.out.println(stack);
		System.out.println(min);
	}

	public void pop() {
		if (!stack.isEmpty() && !min.isEmpty()) {
			stack.remove(stack.size() - 1);
			min.remove(min.size() - 1);
		}

	}

	public int top() {
		if(!stack.isEmpty()) {
		return stack.get(stack.size()-1);
		} else {
			return 0;
		}
	}

	public int getMin() {
		
		if(!min.isEmpty()) {
			return min.get(min.size() - 1);
		}else {
			return 0;
		}

	}

	public static void main(String[] args) {
		int val = -2;
		MinStack obj = new MinStack();
		obj.push(val);
		obj.pop();
		int param_3 = obj.top();
//		int param_4 = obj.getMin();

	}

}

// points to note
// This solution cannot be implemented using integer array, due to fixed size or in java array is 
//static and we need to declare the size before using.
// therefore use Arraylist directly instead of wasting time.
//
