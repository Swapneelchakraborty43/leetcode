//Leetcode day 13
package leetcode;

import java.util.Stack;

public class ReversePolishNotation {

	public static int evalRPN(String[] tokens) {
		int a = 0;
		int b = 0;
		int res = 0;
		Stack<Integer> st = new Stack<Integer>();

		for (String s : tokens) {
			switch (s) {
			case "+":
				a = st.pop();
				b = st.pop();
				res = a + b;
				st.push(res);

				break;
			case "-":
				a = st.pop();
				b = st.pop();
				res = b - a;
				st.push(res);
			
				break;
			case "*":
				a = st.pop();
				b = st.pop();
				res = a * b;
				st.push(res);
				break;

			case "/":
				a = st.pop();
				b = st.pop();
				res = b / a;
				st.push(res);
				break;

			default:
				st.push(Integer.parseInt(s));
				break;
			}
		}
		
		return st.pop();
	}

	public static void main(String[] args) {
		String s[] = { "4","13","5","/","+" };
		int evalRPN = evalRPN(s);
		System.out.println(evalRPN);

	}

}

//logic
//1. traverse through the input string and push the operands into the stack.
//2. When an operator is encountered pop the previous two elements and perform the calculation
//3. Push the result back on to the stack
//4. continute till the last operator is reached.
//5. Return the result