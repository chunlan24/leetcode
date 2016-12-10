public class Solution {
     public int[] searchRange(int[] A, int target) {
         int[] ret = {-1, -1};
         
         if (A == null || A.length == 0) {
             return ret;
         }
         
         int len = A.length;
         int left = 0; 
         int right = len - 1;
         
         // so when loop end, there will be 2 elements in the array.
         // search the left bound.
         while (left < right - 1) {
             int mid = left + (right - left) / 2;
             if (target == A[mid]) {
                 right = mid;
             } else if (target > A[mid]) {
                 // move right;
                 left = mid;
             } else {
                 right = mid;
             }
         }
         
         if (A[left] == target) {
             ret[0] = left;
         } else if (A[right] == target) {
             ret[0] = right;
         } else {
             return ret;
         }
         
         left = 0; 
         right = len - 1;
         // so when loop end, there will be 2 elements in the array.
         // search the right bound.
         while (left < right - 1) {
             int mid = left + (right - left) / 2;
             if (target == A[mid]) {
                 left = mid;
             } else if (target > A[mid]) {
                 // move right;
                 left = mid;
             } else {
                 right = mid;
             }
         }
         
         if (A[right] == target) {
             ret[1] = right;
         } else if (A[left] == target) {
             ret[1] = left;
         } else {
             return ret;
         }
         
         return ret;
     }
}