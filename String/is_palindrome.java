public boolean isPalindrome(String str, startIndex, endIndex){
	int startIndex = 0;
	int endIndex = str.length-1;
	while(startIndex < endIndex){
		char frontChar = str.charAt(startIndex)
		char endChar = str.charAt(endIndex)
		if(frontChar != endChar){
			return false;
		}
		startIndex++;
		endIndex--;
	}

	return true;
}
