class Solution {
    public int[] separateDigits(int[] nums) {
      String number = "";
      for(int i : nums)
      {
         number+=Integer.toString(i);
      }
      int []  ans = new int [number.length()];
      int k = 0;
       for(char c : number.toCharArray())
       {
           ans[k++] = c -'0';
       }
       return ans;
    }
}