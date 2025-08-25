class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String [] str = text.split(" ");
        List<String> a = new ArrayList<>();
        for(int i=1;i<str.length;i++)
        {
            if(str[i].equals(second) && str[i-1].equals(first) && i+1 <str.length)
            {
                 a.add(str[i+1]);
            }
        }
        System.out.print(a);
        String [] ans = new String [a.size()];
        for(int i=0;i<ans.length;i++)
        {
            ans[i] = a.get(i);
        }
        return ans;
    }
}