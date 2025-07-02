class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i: nums){
            if(even(i)) count++;
        }
        return count;
        
    }
    boolean even(int nums){
        int aa= digit(nums);
        if(aa % 2==0){
            return true;
        }
        return false;
    }
    int digit(int nums){
        if(nums<0) nums=nums*-1;
        return(int)(Math.log10(nums)+1);

    }
    // int digit(int nums){
    //     int count=0;
    //     if(nums==0) return 1;
    //     if(nums<0) return nums*-1;
    //     while(nums>0){
    //         count++;
    //         nums/=10;
    //     }
    //     return count;
    // }
}