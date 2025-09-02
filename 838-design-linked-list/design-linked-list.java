class MyLinkedList {
    List<Integer> li;
    public MyLinkedList() {
        this.li = new ArrayList<>();
    }
    
    public int get(int index) {
        if(li.isEmpty() || index > li.size()-1)
        {
             return -1;
        }
        return li.get(index);
    }
    
    public void addAtHead(int val) {
        li.add(0,val);
    }
    
    public void addAtTail(int val) {
        li.add(val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index > -1 && index < li.size()){
        li.add(index,val);
        }
        if(index+1 == li.size()+1)
        {
             li.add(index,val);
        }
        return;
    }
    
    public void deleteAtIndex(int index) {
        if(li.isEmpty() || index > li.size()-1)
        {
             return;
        }
        li.remove(index);
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */