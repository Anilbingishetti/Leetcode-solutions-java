class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> rows = new ArrayList<>();
        List<Integer>  first_row = new ArrayList<>();
        first_row.add(1);
        rows.add(first_row);
        for(int i=0;i<rowIndex;i++)
        {
            List<Integer> prev = rows.get(rows.size()-1);
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j=1;j<prev.size();j++)
            {
                curr.add(prev.get(j-1)+prev.get(j));
            }
            curr.add(1);
            rows.add(curr);
        }
        return rows.get(rowIndex);
    }
}