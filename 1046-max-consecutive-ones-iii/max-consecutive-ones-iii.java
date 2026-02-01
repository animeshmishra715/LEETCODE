class Solution {
    public int longestOnes(int[] nums, int k) {
        int d=0,l=0,r=0,count=0,a=0,c=0;
        while(r<nums.length){
            if(nums[r]==0){
                d++;
            }
            while(d>k){
                if(nums[l]==0){
                    d--;
                }
                    l++;
                
            }
            if(d<=k){
                c=r-l+1;
                count=Math.max(c,count);
            }
            
            r++;

        }
        return count;

    }
}