class Solution {
    public int countLargestGroup(int n) {
        int[] count = new int[37];

        for (int i = 1; i <= n; i++) {
            int sum = digitSum(i);
            count[sum]++;
        }

        int maxSize = 0;
        for (int c : count) {
            maxSize = Math.max(maxSize, c);
        }

        int result = 0;
        for (int c : count) {
            if (c == maxSize) {
                result++;
            }
        }

        return result;
    }

    private int digitSum(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
}
