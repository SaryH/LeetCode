class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1,right=Integer.MIN_VALUE;
        for(int i: piles){
            right=Math.max(i,right);
        }
        while(left<right){
            int mid=(left+right)/2;
            int hours=0;
            for(int i:piles){
                hours+=Math.ceil((double)i/mid);
            }
            if(hours<=h)
                right=mid;
            else
                left=mid+1;
        }
        return right;
    }
}