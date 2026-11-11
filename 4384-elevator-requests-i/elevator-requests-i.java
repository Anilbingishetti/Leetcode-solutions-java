class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int a = 0;
        int c = 0;
        for(int i : requests){
            a+=Math.abs(c - i);
            c = i;
        }
        return a;
    }
}