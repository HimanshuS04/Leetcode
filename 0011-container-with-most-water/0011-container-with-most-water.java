class Solution {
    public int maxArea(int[] height) {
        int maxArea=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int c_area=(right-left)* Math.min(height[left],height[right]);
            maxArea= Math.max(maxArea,c_area);

            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;

    }
        
    }
