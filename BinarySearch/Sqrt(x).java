/**

Given a non-negative integer x, compute and return the square root of x.

Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.
*/

/**
My approach, using binary search, fails some test cases
*/
class Solution {
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
            else if (((nums[mid]) * (nums[mid])) > nums[mid]) {low = mid+1;}
        }
        return -1;
    }
}


//redefined the approach to use long values and to get the values that dont give the exact root to fall under high -1

class Solution {
     public int mySqrt(int x) {
        long high = 0, low = x, mid = 0;
        if(x < 2) {
            return x;
        }
        while(high <= low) {
            mid = (high + low) / 2;
            if((mid * mid) == x) {
                return (int)mid;
            }
            else if((mid * mid) < x) {
                high = mid + 1;
            } 
            else if((mid * mid) > x) {
                low = mid - 1;
            }
        }
        
        return (int)high-1;
    }
}

//passes all the tets cases
