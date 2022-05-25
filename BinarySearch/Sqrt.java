/**
 * Given a non-negative integer x, compute and return the square root of x.

Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.
 */

 /**
  * My approach:
  Tested the bianry search with a target, it worked!
  Replaced the target with the square of the elements at a position, checked if it equals x then return mid
  if less, mid = mid-1
  if high, mid = mid+1
  */

public class Sqrt {
    public int mySqrt(int x) {
        // List <Integer> nums = new ArrayList<>();
        // for(int i = 0; i<x; i++){
        //     nums.add(i);
        // }
        int [] nums = new int[x];
        for(int i = 0; i<x; i++){
            nums[i] = i;
        }
        int high = nums.length;
        int low = 0;
        int mid;
        while(low<=high){
            mid = low+(high-low)/2;
            if(((nums[mid]) * (nums[mid])) == x) return mid;
            if(((nums[mid]) * (nums[mid])) < nums[mid]){high = mid-1;}
            else{low = mid+1;}
        }
        return -1;
    }
    
}
