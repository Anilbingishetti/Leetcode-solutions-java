class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        for (int i = 1; i < arr.length - 1; i++) { // peak can't be at edges
            if (left_search(arr, i) && right_search(arr, i)) {
                return true;
            }
        }
        return false;
    }

    public boolean left_search(int[] arr, int ind) {
        for (int i = 1; i <= ind; i++) {
            if (arr[i] <= arr[i - 1]) { // must strictly increase
                return false;
            }
        }
        return true;
    }

    public boolean right_search(int[] arr, int ind) {
        for (int i = ind + 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) { // must strictly decrease
                return false;
            }
        }
        return true;
    }
}
