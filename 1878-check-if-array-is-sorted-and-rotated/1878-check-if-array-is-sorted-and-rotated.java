class Solution {
    public boolean check(int[] nums) {
        int n=pivot(nums);
        if (n==-1) return true;
        for(int i=0;i<nums.length-1;i++)
       {
        int curr= nums[(n+i)% nums.length];
        int c_next=nums[(n+i+1)% nums.length];
        if(curr>c_next){
            return false;
        }
        }
        return true;      
    }

    public int pivot(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return i+1;
            }
        }
        return -1;
    }
}