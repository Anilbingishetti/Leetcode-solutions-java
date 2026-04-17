class Solution {
    public int minMirrorPairDistance(int[] nums) {
        int min = Integer.MAX_VALUE;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i])){
                min = Math.min(min,i-map.get(nums[i]));
            }
            map.put(reversedNum(nums[i]),i);
        }
        if(min == Integer.MAX_VALUE)
        {
            return -1;
        }
        return min;
    }
    public int reversedNum(int x){
        int ans = 0;
        while(x > 0)
        {
            ans = (ans*10)+x%10; 
            x/=10;
        }
        return ans;
    }
}