class FrontMiddleBackQueue {
    List<Integer> li;
    int mid;
    public FrontMiddleBackQueue() {
        this.li = new ArrayList<>();
        this.mid = 0;
    }
    
    public void pushFront(int val) {
        li.add(0,val);
    }
    
    public void pushMiddle(int val) {
               mid = li.size()/2;
               li.add(mid,val);
    }
    
    public void pushBack(int val) {
        li.add(val);
    }
    
    public int popFront() {
        if(li.isEmpty())
        {
             return -1;
        }
        return li.remove(0);
    }
    
    public int popMiddle() {
         if(li.isEmpty())
        {
             return -1;
        }
        int size = li.size();
        if(size%2 == 0)
        {
             mid = (size-1)/2;
        }
        else{
            mid = size/2;
        }
        return li.remove(mid);
    }
    
    public int popBack() {
        if(li.isEmpty())
        {
             return -1;
        }
        return li.remove(li.size()-1);
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */