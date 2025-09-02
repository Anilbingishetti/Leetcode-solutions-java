class Solution {
    public boolean isPowerOfTwo(int n) {
        int bit = Integer.bitCount(n);
        return n > 0 && bit == 1;
    }
}