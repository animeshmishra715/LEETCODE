class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l=0,r=1,a=0,index=0;
        int max=Integer.MIN_VALUE;
        int b=0;
        while(r<arr.length-1){
            l=r-1;
            a=r+1;
            if(arr[r]>arr[l]&&arr[r]>arr[a]){
                index=1;
                return r;
            }
            r++;
        }if(arr.length==1){
            return 0;
        }
        if(index==0){
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    b=i;
                    max=arr[i];
                }
                
            }
            return b;
        }
        return 0;
    }
}