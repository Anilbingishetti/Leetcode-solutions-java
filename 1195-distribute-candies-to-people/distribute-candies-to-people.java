class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int [] ans = new int [num_people];
        int sum= candies;
        int k = 1;
        while(sum > 0)
        { 
           for(int i=0;i<num_people;i++)
           {
               if(sum < k)
               {
                 ans[i]+=sum;
                 sum = 0;
                 break;
               }
               ans[i] += k;
               sum-=k;
               k++;
           }
           if(sum < 0)
           {
             break;
           }
        }
        return ans;
    }
}