class Solution {
    public int[] singleNumber(int[] nums) {
       HashMap<Integer, Integer> map = new HashMap<>();
       int []arr= new int[2];
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }int i=0;
        for (Map.Entry<Integer, Integer> a : map.entrySet()) {
            
            if (a.getValue() .equals(1)) {
                arr[i]=a.getKey();
                i++;
            }
        }
        return arr;
    }
}