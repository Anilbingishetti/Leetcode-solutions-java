class Solution {
    public int[] sumZero(int n) {
        int [] ans = new int [n];
        int mid = -1;
        if(n%2 ==0)
        {
           mid = n/2 -1; 
           int left = mid;
           int right = mid+1;
           int l1 = -1;
           int r1 =  1;
           while(left >= 0)
           {
             ans[left] = l1;
             l1--;
             left--; 
           }
           while(right < n)
           {
             ans[right] = r1;
             r1++;
             right++;
           }
        }
        else{
              mid = (n/2);
              ans[mid] = 0;
              int left = mid-1;
              int right = mid+1;
              int l1 = -1;
              int r1 = 1;
              while(left >= 0)
              {
                ans[left] = l1;
                l1--;
                left--;
              }
              while(right < n)
              {
                ans[right] = r1;
                r1++;
                right++;
              }
        }
        return ans;
    }
}