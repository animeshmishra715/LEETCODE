class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int max = 0;
        for (int value : map.values()) {
            max = Math.max(value, max);
        }
        List<Integer> ans = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()>(nums.length)/3){
                ans.add(entry.getKey());
            }
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        return ans;
    }
}