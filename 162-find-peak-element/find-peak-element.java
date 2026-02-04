class Solution {
    public int findPeakElement(int[] nums) {
        int l=0,r=1,a=0,index=0;
        int max=Integer.MIN_VALUE;
        int b=0;
        while(r<nums.length-1){
            l=r-1;
            a=r+1;
            if(nums[r]>nums[l]&&nums[r]>nums[a]){
                index=1;
                return r;
            }
            r++;
        }
        if(index==0){
            for(int i=0;i<nums.length;i++){
                if(nums[i]>max){
                    b=i;
                    max=nums[i];
                }
                
            }
            return b;
        }
        return 0;
    }
}