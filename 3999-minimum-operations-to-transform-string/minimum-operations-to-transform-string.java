class Solution {
    public int minOperations(String s) {
        int maxSteps = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int steps = (c == 'a') ? 0 : ('z' - c + 1); 
            if (steps > maxSteps) maxSteps = steps;
        }
        return maxSteps;
    }
}
