class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int low=1,high=Arrays.stream(piles).max().getAsInt();
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            long sum=0;
            for(int i=0;i<piles.length;i++){
                sum=sum+(piles[i]+mid-1)/mid;
            }
            if (sum <= h) {
                ans = mid;
                high = mid - 1; 
            } else {
                low = mid + 1; 
            }
        }
        return ans;

    }
}