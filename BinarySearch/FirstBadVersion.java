/**
ou are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

*/

/**
My approach:
Use binary search
find mid
call the api using mid
Check the values before and after mid if are satisfactory.

*/

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int first = 0;
        int last = n;
        int mid;
        while (first <= last){
            mid = first + (last -first) /2 ;
            if (isBadVersion(mid)){
                if (!isBadVersion(mid - 1)){
                    return mid;
                }else{
                    last = mid -1;
                }
            }else{
                first = mid + 1;
            }
        }
        return -1;
    }
}
