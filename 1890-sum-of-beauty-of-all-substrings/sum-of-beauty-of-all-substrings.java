class Solution {
    public int beautySum(String s) {
        int sum = 0;
        for(int i=0;i<s.length();i++)
        {
        int [] freq = new int [26];
           for(int j=i;j<s.length();j++)
           {
               freq[s.charAt(j) - 'a']++;
               sum+=find_beauty(freq);
           }
        }
        return sum;
    }
    public int find_beauty(int [] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i : arr)
        {
           if (i > 0) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        }
        return max-min;
    }
}