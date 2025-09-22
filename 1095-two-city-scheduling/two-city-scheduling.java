class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs,(a,b)->{
         int diffa = a[0] - a[1];
         int diffb = b[0] - b[1];
        return Integer.compare(diffa,diffb);
    });
      int sum =0;
      int n1 = costs.length/2;
      for(int i=0;i<n1;i++)
      {
         sum+=costs[i][0];
      }
      for(int i=n1;i<costs.length;i++)
      {
         sum+=costs[i][1];
      }
      return sum;
    }
}