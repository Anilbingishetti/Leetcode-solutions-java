class Solution {
    public String[] divideString(String s, int k, char fill) {
        int groups = (s.length() + k - 1) / k;
        String[] ans = new String[groups];
        int idx = 0;
        for (int i = 0; i < s.length(); i += k) {
            StringBuilder sb = new StringBuilder(k);
            for (int j = i; j < i + k; j++) {
                if (j < s.length()) {
                    sb.append(s.charAt(j));
                } else {
                    sb.append(fill);
                }
            }
            ans[idx++] = sb.toString();
        }
        return ans;
    }
}
