class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l=0,r=0,avg=0,min=0,sum=0;
        while(r<arr.length){
            sum= sum +arr[r];
            
            // while(r-l+1!=k){
            //     sum=sum+arr[r];
            //     r++;
            // }
            // avg=(sum/k);
            // if(avg>=threshold){
            //     min++;
            // }
            // sum=sum-arr[l];          
            // r++;
            // l++;
            if(r-l+1==k){
                avg=sum/k;
                if(avg>=threshold ){
                    min++;
                }
                sum=sum-arr[l];
                l++;
            }
            r++;
        
        }
        return min;
    }
}