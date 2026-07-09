class Solution {
    public int findMin(int[] nums) {

        /*
        this is bs problem as it is stated "sorted" ,  we use bs , as it is roated so , 
        identification :- if an array is rotated , then its  mid elment must be high
        so min element must in right of mid : search in right half
        else search in other half.
        finally the pointer (left ) came to stop at min Idx.
        */
        int l = 0;
        int h = nums.length-1;

        while( l < h){

            int mid = l + (h-l)/2;

            if(nums[mid] > nums[h]){
                l = mid+1;
            }else{
                h = mid;
            }
        }
        return nums[l];
    }
}
