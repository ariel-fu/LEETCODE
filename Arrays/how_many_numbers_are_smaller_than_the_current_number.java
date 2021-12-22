public int[] smallerNumbersThanCurrent(int[] nums) {
   int[] ans = new int[nums.length];
   int max = 0;
   for(int i = 0; inums.length; i++) {
  	 if(nums[i]  max) {
  		 max = nums[i];
  	 }
   }

   int[] hash = new int[max+1];
   for(int i = 0; inums.length; i++) {
  	 int curr = nums[i];
  	 hash[curr]++;
   }
   
   for(int i = 0; inums.length; i++) {
  	 int totalLessThan = 0; 
  	 int currNum = nums[i];
  	 if(currNum == hash.length) {
  		 totalLessThan = nums.length-1;
  	 } else {
  		 for(int j = 0; jcurrNum; j++) {
    			 totalLessThan += hash[j];
	    	 } 
  	 }
  	 ans[i] = totalLessThan;
   }
   return ans;
}