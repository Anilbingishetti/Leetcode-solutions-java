class Solution {
    public int countMaxOrSubsets(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        sub(nums,0,li,new ArrayList<>());
        int max = max_or(li);
        return  max_count(li,max);
    }
     public void sub(int []arr,int j,List<List<Integer>> li,List<Integer> l1)
    {
        li.add(new ArrayList<>(l1));
        for(int i = j;i<arr.length;i++)
        {
           l1.add(arr[i]);
           sub(arr,i+1,li,l1);
           l1.removeLast();
        }
    }
    public int max_or(List<List<Integer>> li)
    {
        
            int max = Integer.MIN_VALUE;
        for(List<Integer> l : li)
        {
            if(l.size()==0) continue; 
            int or = 0;
            for(int i:l)
            {
                or|=i;
            }
            max = Math.max(max,or);
        }
        return max;
    }
    public int max_count(List<List<Integer>> li,int max)
    {
        int count = 0;
        for(List<Integer> l : li)
        {
            int or = 0;
            for(int i:l)
            {
                or|=i;
            }
            if(or == max)
            {
                count++;
            }
        }
        return count;
    }
}