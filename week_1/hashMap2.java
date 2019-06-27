class Solution {
    public boolean isAnagram(String s, String t) {
    char temp[] = t.toCharArray();
    char temp2[] = s.toCharArray();

        Arrays.sort(temp);
        String x = new String(temp);

        Arrays.sort(temp2);
        String y = new String(temp2);
    if (s.length() == 0 && t.length() == 0) {
        return true;
    }else{
        if(x.equals(y)){
            return true;
        }
    }
   return false;
    }
}
