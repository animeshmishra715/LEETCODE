class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0,high=nums.length-1;
        int []ans= new int [2];
        ans[0]=-1;
        ans[1]=-1;
        if(nums.length==1&&nums[0]==target){
            ans[0]=0;
            ans[1]=0;
            return ans;
        }
        while(low<=high){
            int mid =low+(high-low)/2;
            if(nums[mid]>target){
                high = mid - 1;
            }
            else if(nums[mid]<target){
                    low=mid+1;

            }else{
                
                int i=mid;
                while(i>=0&&nums[i]==nums[mid]){
                    ans[0]=i;
                    i--;
                }
                i=mid;
                while(i<nums.length&&nums[i]==nums[mid]){
                    ans[1]=i;
                    i++;
                }
                
                break;
            }
            
        }
        return ans;
    }
}