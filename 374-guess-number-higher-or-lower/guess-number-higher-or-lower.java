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
        int s = 1, e = n;

        while (s <= e) {
            int m = s + (e - s) / 2;
            if (guess(m) == -1) 
                e = m;
            else if (guess(m) == 1) {
                s = m + 1;
            } else  
                return m;
        }
        return 0;
    }
}