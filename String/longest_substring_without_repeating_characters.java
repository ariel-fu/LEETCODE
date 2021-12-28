public int lengthOfLongestSubstring(String s) {
        Character[] possibleCharacters = new Character[255];
		// start at 0
		int longestLength = 0;
		int currLength = 0;

		for (int i = 0; i < s.length(); i++) {
			int currIndex = i;
			char currChar = s.charAt(currIndex);
			int currAscii = (int) currChar;
			while (possibleCharacters[currAscii] == null) {
				currLength++;
				possibleCharacters[currAscii] = currChar;
				// if we are at the end, end the while loop
				currIndex++;
				if (currIndex < s.length()) {
					currChar = s.charAt(currIndex);

					currAscii = (int) currChar;
				} else {
					break;
				}
			}

			if (currLength > longestLength) {
				longestLength = currLength;
			}
			// reset currLength
			currLength = 0;
			// reset the character array to nulls
			possibleCharacters = new Character[255];
		}

		return longestLength;
	}