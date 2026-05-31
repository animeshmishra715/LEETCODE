class Solution {
    public int searchInsert(int[] nums, int target) {
        int k=target;
        int low=0;
        int high = nums.length-1;
        int ans=-1;
        while(low<=high){
            int mid= low+(high-low)/2;
            ans=mid;
            if(nums[mid]==k){
                return mid;
            }else if(nums[mid]>k){
                
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        
        return low;
    }
}