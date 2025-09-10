class Solution {
    public List<String> cellsInRange(String s) {
        String [] str = s.split(":");
        List<String> li = new ArrayList<>();
        char c1 = str[0].charAt(0);
        int ind1 = str[0].charAt(1)-'0';
        char c2 = str[1].charAt(0);
        int ind2 = str[1].charAt(1)-'0';
        while(c1 <= c2)
        {
            StringBuilder sb = new StringBuilder();
            for(int i=ind1;i<=ind2;i++)
            {
                sb.append(c1);
                sb.append(i);
                li.add(sb.toString());
                sb.setLength(0);
            }
            c1++;
        }
        return li;
    }
}