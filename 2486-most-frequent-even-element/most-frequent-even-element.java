class Solution {
    public int mostFrequentEven(int[] nums) {
        int []hash=new int[100000+1];
        for(int i=0;i<nums.length;i++){
            hash[nums[i]]+=1;
        }
        int d=Integer.MAX_VALUE;
        int c=Integer.MIN_VALUE;
        for(int i=0;i<hash.length;i++){
            if(i%2==0){
            c=Math.max(c,hash[i]);
            }
            
        }
        if(c==0) return -1;
        for(int i=0;i<hash.length;i++){
            if(i%2==0){
            if(hash[i]==c){
                d=Math.min(d,i);
            }
            }
            
        }
        return d;
    }
}