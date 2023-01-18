class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int currmax=0,currmin=0,sum=0;
        for(int n:nums){
            sum+=n;
            currmax=Math.max(currmax+n,n);
            currmin=Math.min(currmin+n,n);
            max=Math.max(max,currmax);
            min=Math.min(min,currmin);

        }
    return max<0?max:Math.max(max,sum-min);

    }
}
