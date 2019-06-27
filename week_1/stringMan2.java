class Solution {
    public boolean detectCapitalUse(String word) {
         if(word.length() == 1)
	            return true;
	     boolean isCapital = word.charAt(1) <= 'Z';

	     for(int i = 2; i < word.length(); i++){
	        if(word.charAt(i) >= 'a' && isCapital)
	            return false;
	        if(word.charAt(i) <= 'Z' && !isCapital)
	            return false;
	        }

	    if(word.charAt(0) >= 'a' && isCapital) {
            return false;
        }
	    return true;
    }
}
