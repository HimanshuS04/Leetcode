class Solution {
    public int[] rearrangeArray(int[] nums) {
        int posIdx = 0;
        int negIdx = 1;
        int[] arr = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > 0){
                arr[posIdx] = nums[i];
                posIdx+=2;
            }else{
                arr[negIdx] = nums[i];
                negIdx += 2;
            }
        }
        return arr;
    }
}