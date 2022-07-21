/**

We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

You call a pre-defined API int guess(int num), which returns three possible results:

-1: Your guess is higher than the number I picked (i.e. num > pick).
1: Your guess is lower than the number I picked (i.e. num < pick).
0: your guess is equal to the number I picked (i.e. num == pick).
Return the number that I picked.

 

*/

//My first approach, poor time complexity though. Tranverse the entire numbers to n checking if the nth number is the guessed number. if guessed, return the number.
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        for (int i = 1; i < n; i++){
            if (guess(i) == 0){
                return i;
            }
            
        }
        return n;
        
    }
}


/**
Using a binary search, better time complexity
init high low mid and a temp for checking the guessAPI.
if temp after checking the guess is 0, return the mid, if less adjust the high to be mid -1, if more adjust the low to be mid + 1
*/

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int high = n; 
        int low = 0;
        int mid;
        int temp;
        while (high >= low){
            mid = low + (high - low) / 2;
            temp = guess(mid);
            if (temp == 0){
                return mid;
            }
            else if (temp < 0){
                high  = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
        
    }
}
