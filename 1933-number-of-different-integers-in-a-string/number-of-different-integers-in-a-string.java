class Solution {
    public int numDifferentIntegers(String word) {
        Set<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char c : word.toCharArray()) {
            if (Character.isDigit(c)) {
                sb.append(c);
            } else {
                if (sb.length() > 0) {
                    set.add(stripLeadingZeros(sb.toString()));
                    sb.setLength(0);
                }
            }
        }

        // Final number
        if (sb.length() > 0) {
            set.add(stripLeadingZeros(sb.toString()));
        }

        return set.size();
    }

    private String stripLeadingZeros(String num) {
        int i = 0;
        while (i < num.length() && num.charAt(i) == '0') {
            i++;
        }
        return i == num.length() ? "0" : num.substring(i);
    }
}
