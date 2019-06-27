class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum;
        int[] list = new int[2];

    for (int a = 0; a < nums.length - 1; a++) {
        for (int b = a + 1; b < nums.length; b++) {
            sum = nums[a] + nums[b];

            if (sum == target) {
                list[0] = a;
                list[1] = b;
                break;
            }
        }
    }

    return list;
    }
}
