// Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

// You must write an algorithm with O(log n) runtime complexity.


// My first approach using linear search, very bad runtime complexity
// Tranverse the array
// Check if the element at index matches the target
// Return the target
// Else Return -1
public class BinarySearch {
    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == target){
                return i;
            }
        }
        return -1;
        
    }
    
}

// Second approach using binary search
// set lower bound
// set upper bound
// while target is not found return -1
// set midpoint (low + (high - low) /2)
/*  if A[midPoint] < x
set lowerBound = midPoint + 1
         
if A[midPoint] > x
   set upperBound = midPoint - 1 

if A[midPoint] = x 
   EXIT: x found at location midPoint
**/

class Solution {
    public int search(int[] nums, int target) {
        int high = nums.length -1;
        int low = 0;
        int mid;
        while(low <= high){
            mid = low + (high - low) /2;
            if (nums[mid] == target) {return mid;}
            if (target < nums[mid]){high = mid -1;}
            else{low = mid + 1;}
        }
        return -1;
        
    }
}