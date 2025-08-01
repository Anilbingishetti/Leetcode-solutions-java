class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> li = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        li.add(new ArrayList<>(first));
        for(int i=1;i<numRows;i++)
        {
             List <Integer> ans = li.get(li.size()-1);
             List<Integer> fin = new ArrayList<>();
             fin.add(1);
             for(int j=1;j<ans.size();j++)
             {
                fin.add(ans.get(j-1) + ans.get(j));
             }
             fin.add(1);
             li.add(new ArrayList<>(fin));
        }
        return li;
    }
}