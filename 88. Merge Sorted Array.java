class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {


    int k = m+n-1;

    while(n>0 && m>0){
        if(nums1[m-1]<nums2[n-1]){
            nums1[k] = nums2[n-1];
            n -=1;
        }
        else{
            
            nums1[k]=nums1[m-1];
            m-=1;
        }

        k-=1;
    }
    
    while(n>0){
        nums1[k]=nums2[n-1];
        k-=1;
        n-=1;


    }
       
    }


}