class Solution {
    public int mostFrequentEven(int[] nums) {
        int a = 0;
        int b = 0;
        int c = -1;
        int d = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            b = count;
            if (nums[i] % 2 == 0) {
                d = Math.min(d, nums[i]);

                if (b > a || (b == a && nums[i] < c)) {
                    a = b;
                    c = nums[i];
                }
            }
        }
        if (c == -1 && d < Integer.MAX_VALUE) {
            return d;
        }

        if (nums.length == 1 && nums[0] % 2 == 0)
            return nums[0];
        return c;
    }
}