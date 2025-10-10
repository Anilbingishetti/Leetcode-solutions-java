class Solution {
    public String maximumTime(String s) {
        StringBuilder sb = new StringBuilder();
        if (s.charAt(0) == '?') {
            if (s.charAt(1) == '?' || s.charAt(1) <= '3') sb.append('2');
            else sb.append('1');
        } else {
            sb.append(s.charAt(0));
        }
        if (s.charAt(1) == '?') {
            if (sb.charAt(0) == '2') sb.append('3');
            else sb.append('9');
        } else {
            sb.append(s.charAt(1));
        }
        sb.append(':');
        if (s.charAt(3) == '?') sb.append('5');
        else sb.append(s.charAt(3));
        if (s.charAt(4) == '?') sb.append('9');
        else sb.append(s.charAt(4));
        return sb.toString();
    }
}
