class Solution {
    public int mirrorDistance(int n) {
        int reverse_number = 0;
        int actual_number = n;
        while (actual_number > 0) {
            reverse_number = (reverse_number * 10) + (actual_number % 10);
            actual_number /= 10;
        }
        return Math.abs(n - reverse_number);
    }
}