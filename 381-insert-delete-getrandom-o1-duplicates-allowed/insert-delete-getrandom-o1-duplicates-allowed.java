class RandomizedCollection {
    List<Integer> li;
    Random rand;
    Set<Integer> set;
    public RandomizedCollection() {
        this.li = new ArrayList<>();
        this.rand = new Random();
        this.set = new HashSet<>();
    }
    
    public boolean insert(int val) {
        if(li.contains(val))
        {
             li.add(val);
             return false;
        }
        li.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(li.contains(val))
        {
            li.remove(li.indexOf(val));
             return true;
        }
        return false;
    }
    
    public int getRandom() {
        int ind = rand.nextInt(li.size());
        return li.get(ind);
    } 
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */