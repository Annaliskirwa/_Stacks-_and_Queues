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
