public class FindSingleOccurence{

          public static int findSingleOccurence(int[] nums){
		  int singleOccurence = nums[0];
		  
		  for(int i = 3; i < nums.length; i++){
			 if(nums[i] != singleOccurence){
				 return singleOccurence;
			 }
		  }
		  return singleOccurence;
		  }

		public static void main(String[] args){
		int[] nums = {2, 1, 4, 2, 1, 2};
		System.out.println(findSingleOccurence(nums));

	
	
	}
}