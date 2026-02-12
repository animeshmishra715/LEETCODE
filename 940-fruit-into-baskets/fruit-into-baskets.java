class Solution {
    public int totalFruit(int[] fruits) {
        int l = 0, r = 0, count = 0;
        HashMap<Integer, Integer> set = new HashMap<>();
        while (r < fruits.length) {
            set.put(fruits[r], set.getOrDefault(fruits[r], 0) + 1);
            if (set.size() > 2) {
                while (set.size() > 2) {
                    set.put(fruits[l], set.get(fruits[l]) - 1);

                    if (set.get(fruits[l]) == 0) {
                        set.remove(fruits[l]);
                    }
                    l++;
                }
            } else {
                count = Math.max(count, r - l + 1);
            }
            r++;

        }
        return count;
    }
}