class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int left = 0;
        int max = 0;
        for(int i=0;i<fruits.length;i++)
        {
              map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
               while (map.size() > 2) {
                int f = fruits[left];
                map.put(f, map.get(f) - 1);
                if (map.get(f) == 0) {
                    map.remove(f);
                }
                left++;
            }
           max = Math.max( i - left + 1,max);
        }
        return max;
    }
}