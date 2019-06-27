class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList();
        for (int i = left; i <= right;i++) {
            boolean bool = true;
            for (char c:Integer.toString(i).toCharArray()) {
                int num = Character.getNumericValue(c);
                if (num == 0 || i % num != 0) {
                    bool = false;
                    break;
                }
            }
            if (bool) result.add(i);
        }
        return result;
    }
}
