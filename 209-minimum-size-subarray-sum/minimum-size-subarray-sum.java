class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,r=0,count=Integer.MAX_VALUE,sum=0;
        while(r<nums.length){
            sum= sum +nums[r];
            while(sum>=target){
                    count=Math.min(count,r-l+1);
                    sum=sum-nums[l];
                    
                    l++;
                    
                    
                }
            
            r++;
        }if(count ==Integer.MAX_VALUE) return 0;
        return count;
    }
}