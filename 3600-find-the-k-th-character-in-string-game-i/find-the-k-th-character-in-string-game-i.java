class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");
        String s = find_char(k, sb);
        return s.charAt(k-1);
    }

    public String find_char(int k, StringBuilder sb) {
        StringBuilder sb1 = new StringBuilder(sb);

        if (sb1.length() > k) {
            return sb1.toString();
        }

        for (char c : sb.toString().toCharArray()) {
            if (sb1.length() > k) {
                break;
            }
            if (c == 'z') {
                sb1.append('a');
            } else {
                sb1.append((char) (c + 1));
            }
        }

        return find_char(k, sb1);
    }
}
