class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        char[] a = s.toCharArray();
        while (i < j) {

            while (i < j && ! Character.isLetterOrDigit(a[i])) {
                i++;
            }

            while (i < j && ! Character.isLetterOrDigit(a[j])) {
                j--;
            }

            if (Character.isDigit(a[i]) && Character.isDigit(a[j]) && a[i] != a[j]){
                return false;
            } else if (Character.toLowerCase(a[i]) != Character.toLowerCase(a[j])){
                return false;
            } else {
                i ++; j --;
            }
        }
        return true;
    }
}
