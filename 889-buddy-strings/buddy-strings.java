import java.util.HashMap;

class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        if (s.length() == 1) {
            return false; // can't swap a single character
        }

        // Case when both strings are equal
        if (s.equals(goal)) {
            HashMap<Character, Integer> map1 = new HashMap<>();
            for (char c : s.toCharArray()) {
                map1.put(c, map1.getOrDefault(c, 0) + 1);
                if (map1.get(c) > 1) {
                    return true; // duplicate found, can swap without changing string
                }
            }
            return false; // all characters unique
        }

        // Case when they differ
        int count = 0;
        int first = -1, second = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                count++;
                if (count > 2) {
                    return false;
                }
                if (first == -1) {
                    first = i;
                } else {
                    second = i;
                }
            }
        }

        if (count == 2 &&
            s.charAt(first) == goal.charAt(second) &&
            s.charAt(second) == goal.charAt(first)) {
            return true;
        }

        return false;
    }
}
