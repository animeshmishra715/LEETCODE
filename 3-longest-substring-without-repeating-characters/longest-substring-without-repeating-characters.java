class Solution {
    public int lengthOfLongestSubstring(String s) {
        int d=0,c=0,l=0,r=0,count =0;
        Map<Character,Integer> map=new HashMap<>();
        while(r<s.length()){
            if(map.containsKey(s.charAt(r))){

                c=map.get(s.charAt(r));
                l = Math.max(l, c + 1);
               
            }
            map.put(s.charAt(r),r);
            d=r-l+1;
            count=Math.max(count,d);
            r++;
        }
        return count;
    }
}