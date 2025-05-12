class Solution {
    public int maxProduct(int n) {
         List<Integer> li = new ArrayList<>();
         while(n > 0)
         {
            int t = n%10;
            if(t!=0){
                li.add(t);
            }
            n=n/10;
         }
         Collections.sort(li);
         if(li.size() <= 1){
            return 0;
         }
         return li.get(li.size()-2)*li.get(li.size()-1);
    }
}