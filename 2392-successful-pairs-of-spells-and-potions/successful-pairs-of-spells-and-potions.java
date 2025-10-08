import java.util.*;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] ans = new int[spells.length];
        int n = potions.length;
        int k = 0;

        for (int sp : spells) {
            int ind = find(sp, potions, success);
            ans[k++] = n - ind;
        }

        return ans;
    }

    public int find(int sp, int[] arr, long suc) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if ((long) arr[mid] * sp >= suc) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        if ((long) arr[left] * sp < suc)
            return arr.length;

        return left;
    }
}
