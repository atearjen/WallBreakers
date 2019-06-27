class Solution {
    public String reverseVowels(String s) {
        if(s == null || s.length() == 0) {
            return s;
        }

        Set<Character> vowels = new HashSet<>();
        vowels.addAll(Arrays.asList('a','e','i','o','u', 'A', 'E', 'I', 'O', 'U'));

        char[] output = s.toCharArray();
        int low = 0, high = s.length() - 1;

        while(low < high) {

            if(!vowels.contains(output[low])){
                low++;
                continue;
            }
             if(!vowels.contains(output[high])) {
                high--;
                continue;
            }


            char temp = output[low];
            output[low] = output[high];
            output[high] = temp;

            low ++;
            high --;
        }

        return new String(output);
    }
}
