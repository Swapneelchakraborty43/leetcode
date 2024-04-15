//Leetcode day 14
package leetcode;

import java.util.ArrayList;
import java.util.Stack;

public class DailyTempratures {
	public static int[] dailyTemperatures(int[] temp) {
//		int count=0;
//		int k=0;
//		int[] answer = new int[temperatures.length];
//		
//		for(int i=0;i<temperatures.length;i++) {
//			
//			count =0;
//			for(int j=i;j<temperatures.length;j++) {
//				
//				if(temperatures[j]>temperatures[i] ){
//					break;
//				}else {
//					
//					count+=1;
//					if(j==temperatures.length-1) {
//						count =0;
//					}
//				
//				}
//				//System.out.println(count);
//				
//				
//			}
//			answer[i]=count;
//			
//		}
//		


//		int[] answer = new int[temperatures.length];
//		Stack<Integer> st = new Stack<Integer>();
//		ArrayList<Integer> stList = new ArrayList<Integer>();
//
////		for(int i : temperatures) {
////			if(st.peek()>i) {
////				st.pop();
////			}else {
////				st.push(i);
////			}
////		}
//		for (int i = 0; i < temperatures.length; i++) {
//			
//			while(!st.isEmpty() && temperatures[i]>st.peek()) {
//				
//			int index = st.size();
//			
//			st.pop();
//			index-=1;
//			System.out.println("Index"+index);
//			int answer1 = i-index;
//			System.out.println(answer1);
//			}
//			st.push(temperatures[i]);
//			
//		}
//		System.out.println("************************************");
//		for(int i : answer) {
//			System.out.println(i);
//		}
//		
//
//		return answer;
		
		Stack<Integer> st = new Stack<>();
        int n = temp.length, ans[] = new int[n];
//        for(int i = n-1; i >= 0; i--) {
//        	
//        	
//            while(!index.isEmpty() && temp[i] >= temp[index.peek()]) {
//            	System.out.println(temp[index.peek()]);
//                index.pop();
//            }
//            if(!index.isEmpty()) 
//                res[i] = index.peek() - i;
//            index.push(i);
//        }
        //Accepted solution posted on leetcode
        for(int i =0; i<temp.length;i++) {
        	while(!st.isEmpty() && temp[i] > temp[st.peek()]) {
        		int index = st.pop();
        		ans[index] = i-index;
        		
        	}
        	st.push(i);
        	
        }
        
		System.out.println("************************************");
		for(int i : ans) {
			System.out.println(i);
		}
        return ans;

	}

	public static void main(String[] args) {
		int tempratures[] = {73,74,75,71,69,72,76,73};
		dailyTemperatures(tempratures);

	}

}

// we should be able to get the index of the popped element
// we should be able to calculate the difference of indexes in the stack.

// if next element in temp array is greater than the top of the stack 
// pop from the stack and get the index of that element in the temp array
// get the index of the greater element and calculate their difference.
// store the difference in the answer array at the index of the popped element.
// push the greater element into the stack and continue to loop.
// if next is greater than the top of stack pop from the stack and store the next greater element to the stack
