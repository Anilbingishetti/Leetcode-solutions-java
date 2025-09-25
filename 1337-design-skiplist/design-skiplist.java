class Skiplist {
    List<Integer> li;
    public Skiplist() {
        this.li = new ArrayList<>();
    }
    
    public boolean search(int target) {
        return li.contains(target);
    }
    
    public void add(int num) {
        li.add(num);
    }
    
    public boolean erase(int num) {
        if(li.contains(num))
        {
             li.remove(li.indexOf(num));
             return true;
        }
        return false;
    }
}

/**
 * Your Skiplist object will be instantiated and called as such:
 * Skiplist obj = new Skiplist();
 * boolean param_1 = obj.search(target);
 * obj.add(num);
 * boolean param_3 = obj.erase(num);
 */