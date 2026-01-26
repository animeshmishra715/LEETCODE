class Solution {
    public int mostFrequentEven(int[] nums) {
        int[] hash = new int[100000 + 1];
        for (int i = 0; i < nums.length; i++) {
            hash[nums[i]] += 1;
        }
        int c = 0;
        int d = -1;

        for (int i = 0; i < hash.length; i++) {
            if (i % 2 == 0 && hash[i] > 0) {
                if (hash[i] > c) {
                    c = hash[i];
                    d = i;
                } else if (hash[i] == c) {
                    d = Math.min(d, i);
                }
            }
        }


        return d;
    }
}