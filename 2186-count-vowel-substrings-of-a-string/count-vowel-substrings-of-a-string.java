class Solution {
    public int countVowelSubstrings(String word) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            Set<Character> set = new HashSet<>();

            for (int j = i; j < word.length(); j++) {

                char ch = word.charAt(j);

                if (!"aeiou".contains(String.valueOf(ch))) {
                    break;
                }

                set.add(ch);

                if (set.size() == 5) {
                    count++;
                }
            }
        }

        return count;
    }
}