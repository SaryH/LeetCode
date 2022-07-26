class Solution {
    public int first(int[] nums, int target){
        int left=0,right=nums.length-1;
        int index=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]<target)
                left=mid+1;
            else
                right=mid-1;
            if(nums[mid]==target)
                index=mid;
        }
        return index;
    }
    public int last(int[] nums, int target){
        int left=0,right=nums.length-1;
        int index=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]<=target)
                left=mid+1;
            else
                right=mid-1;
            if(nums[mid]==target)
                index=mid;
        }
        return index;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] result=new int[2];
        result[0]=first(nums,target);
        result[1]=last(nums,target);
        
        return result;
    }
}