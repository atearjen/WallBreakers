class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        int idx = 0;
        while (true) {
            for (int i = 1; i < strs.length; i++) {
                if (idx > strs[i-1].length() - 1 || idx > strs[i].length() - 1 || strs[i].charAt(idx) != strs[i-1].charAt(idx))
                    return strs[i].substring(0, idx);
            }
            idx++;
        }
    }
}
