class RecentCounter {
     List<Integer> li;
    public RecentCounter() {
        this.li = new ArrayList<>();
    }
    
    public int ping(int t) {
        li.add(t);
        int count  = 0;
        for(int i : li){
            if(i >= t-3000){
                count++;
            }
        }
        return count;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */