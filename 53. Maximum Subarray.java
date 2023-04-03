class Solution {
    public int maxSubArray(int[] nums) {
        
        int max=nums[0];
        int curr_max=0;

        for (int i = 0; i<nums.length; i++){
            
            curr_max= curr_max + nums[i];

            if(curr_max>max)
                max = curr_max;
            
            if (curr_max<0)
                curr_max=0;
            
        }

        return max;
    }
}
