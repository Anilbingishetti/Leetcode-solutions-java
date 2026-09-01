class Solution {

    public String reorderSpaces(String text) {

        int totalSpaces = 0;

        for (char c : text.toCharArray()) {
            if (c == ' ') {
                totalSpaces++;
            }
        }

        String cleaned = text.replaceAll("\\s+", " ").trim();
        String[] str = cleaned.split(" ");
        if (str.length == 1) {
            return str[0] + " ".repeat(totalSpaces);
        }

        int spaces = totalSpaces / (str.length - 1);
        int remaining = totalSpaces % (str.length - 1);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length; i++) {

            sb.append(str[i]);

            if (i < str.length - 1) {
                sb.append(" ".repeat(spaces));
            }
        }

        sb.append(" ".repeat(remaining));

        return sb.toString();
    }
}