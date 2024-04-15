package leetcode;

public class ProductOfArrayExceptSelf {
	 public static int[] productExceptSelf(int[] nums) {
		 int len = nums.length;
		 
		 int left[] = new int[len];
		 int right[] = new int[len];
		 
		 left[0] = 1;
		 right[len-1] = 1;
		 
		 int mul =1;
		 int k=1;
		 
		 for(int i=0;i<len-1;i++) {
			 mul = mul * nums[i];
			 left[k++] = mul;			
				 }
//		System.out.println();		 
		int var = 1;
		
		int m = len-2;
		for(int l = len-1; l>0 ; l--) {
			
			var = var * nums[l];
			
			right[m--] = var;			
		}
		
		int res[] = new int[nums.length];	 
		 for(int i =0;i<nums.length;i++) {
			 res[i] = left[i]* right[i];
		 }

		return left ;
	        
	    }
	public static void main(String[] args) {
		
		int nums[] = {1,2,3,4};
		
		productExceptSelf(nums);
	}

}
