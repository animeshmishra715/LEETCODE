class Solution {
    public int minimumCost(int[] nums) {
        int ans=0;
        int min1=51;
        int min2=51;
        int a=0;
        for (int i = 1; i < nums.length; i++) {
            min1=Math.min(nums[i],min1);
            if(min1==nums[i]){
            a=i;
            }
            
        }
        for(int i=1;i<nums.length;i++){
            if(i!=a){
                min2=Math.min(nums[i],min2);
            }
        }
        ans=nums[0]+min1+min2;
        return ans;
    }
}