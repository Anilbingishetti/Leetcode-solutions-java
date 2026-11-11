class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int ans = 0;
        int curr = 0;
        for(int i : requests){
            ans+=Math.abs(curr - i);
            curr = i;
        }
        return ans;
    }
}