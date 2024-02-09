public class CodingChallenge8 {
    public int mySqrt(int x) {

        long low = 1;
        long hi = x;
        long mid = 0;


        while (low <= hi) {

            mid = low + ((hi-low)/2);

            if (mid*mid == hi) {
                return (int) mid;
            } else if (mid*mid < hi) {
                low = mid + 1;
            } else {
                hi = mid -1;
            }
        }

        return (int) hi;

    }
}
