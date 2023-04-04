//Solution 1 

class Solution {
    public int[] twoSum(int[] nums, int target) {

        int arr[]={0,0};
 
        for(int i = 0; i< nums.length-1; i++){

            for(int j = i+1 ; j< nums.length; j++){

                if(nums[i]+nums[j]==target){
                    
                arr[0]=j; 
                arr[1]=i;
                return arr;

                }
            }            
        }    
        return arr;

    }

}



//solution 2

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i = 0; i < nums.length; i++){

            int x = target - nums[i];

            if(map.containsKey(x)){
                return new int[]{map.get(x),i};
            }

            map.put(nums[i],i);
        }

        return new int[]{-1,-1};

    }

}
