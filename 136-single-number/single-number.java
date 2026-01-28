class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> a : map.entrySet()) {
            if (a.getValue() == 1) {
                return a.getKey();
            }
        }
        return -1;
    }
}