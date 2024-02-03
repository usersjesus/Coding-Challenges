import java.util.ArrayList;

public class CodingChallenge7 {
    public int search(int[] nums, int target) {

        double low = 0;
        double hi = nums.length;

        while (low < hi) {

            double mid = low + Math.floor((hi-low+1)/2);

            if (target < nums[(int) mid]) {

                hi = mid - 1;

            } else {

                low = mid;

            }

        }

        if (nums[(int) low] == target){
            return (int) low;
        } else {
            return -1;
        }

    }

}
