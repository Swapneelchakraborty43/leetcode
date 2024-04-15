package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
	
		public static List<String> generatePermutations(String input) {
	        List<String> permutations = new ArrayList<>();
	        generatePermutationsHelper(input.toCharArray(), 0, permutations);
	        return permutations;
	    

	}
		 private static void generatePermutationsHelper(char[] arr, int index, List<String> permutations) {
		        if (index == arr.length - 1) {
		        	System.out.println("base condition");
		        	System.out.println(arr.length - 1);
		            permutations.add(new String(arr));
		            return;
		        }
		        for (int i = index; i < arr.length; i++) {
		            // Swap characters at index and i
		            char temp = arr[index];
		            arr[index] = arr[i];
		            arr[i] = temp;

		            // Recursively generate permutations for the remaining characters
		            generatePermutationsHelper(arr, index + 1, permutations);

		            // Swap the characters back to their original positions
		            temp = arr[index];
		            arr[index] = arr[i];
		            arr[i] = temp;
		            
		        }
		 }

	public static void main(String args[]) {
		
		String input = "ab";
        List<String> permutations = generatePermutations(input);

        System.out.println("Permutations of '" + input + "':");
        for (String permutation : permutations) { 
            System.out.println(permutation);

	}

}
}
