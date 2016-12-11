public class Solution {
    public int Sqrt(int x) {
        
        if (x <= 1) {
            return x;
        }
        
        int begin = 1;
        int end = x;
        while (begin <= end) {
            int mid = begin + (end - begin) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid < x / mid) {
                begin = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }
}