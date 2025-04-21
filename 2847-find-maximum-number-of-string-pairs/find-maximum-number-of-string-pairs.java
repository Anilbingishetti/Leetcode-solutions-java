class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        Set<String> seen = new HashSet<>();
        int count = 0;

        for (String word : words) {
            String reversed = new StringBuilder(word).reverse().toString();
            if (seen.contains(reversed)) {
                count++;
            } else {
                seen.add(word);
            }
        }

        return count;
    }
}
