class Solution {
    public int longestSubarray(int[] nums) {
        int l=0,r=0,count=0,max=0,c=0;
        while(r<nums.length){
            count=nums[r];
            if(count==0){
                c=l;
                while(l<r&&nums[l]!=0){
                    l++;
                }
                l++;
            }
            max=Math.max(max,r-c+1);
            r++;
        }
        if(nums.length==1&&nums[0]==0){
            return 0;
        }
        return max-1;
    }
}