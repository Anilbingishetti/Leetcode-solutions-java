class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        for (List<Integer> pos : map.values()) {
            int x = pos.get(0);
            int last = pos.get(pos.size() - 1);
            pos.add(0, last - nums.length);
            pos.add(x + nums.length);
        }
        List<Integer> ans = new ArrayList<>();
        for (int i : queries) {

            List<Integer> inds = map.get(nums[i]);
            if (inds.size() == 3) {
                ans.add(-1);
                continue;

            }
            int ind = Collections.binarySearch(inds,i);
            int min = Integer.MAX_VALUE;
            if (ind - 1 >= 0) {
                min = Math.min(min, Math.abs(i - inds.get(ind - 1)));
            }
            if (ind + 1 < inds.size()) {
                min = Math.min(min, Math.abs(i - inds.get(ind + 1)));
            }
            ans.add(min);
        }
        return ans;
    }
}