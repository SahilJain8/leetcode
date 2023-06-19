
// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
// You must write an algorithm with O(log n) runtime complexity.


class Solution {
    public int searchInsert(int[] arr, int target) {

        int start = 0;
        int end = arr.length -1;


        if(arr.length == 1){
            if(arr[0] >= target){
                return 0;
            }
            return 1;
        }

        boolean isAsend = arr[start] < arr[end];

       while(start <= end){

            int mid = start + (end -start)/2;

            if(arr[mid] == target){
                return  mid;
            }
            if(isAsend){
                if(arr[mid] < target){
                    start = mid +1;
                }
                else {
                    end = mid - 1;
                }

            }
            else {
                if(arr[mid] > target){
                    start = mid +1;
                }
                else {
                    end = mid - 1;
                }
            }



        }



        return  start;

        
    }
}