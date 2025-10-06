class Bitset {
    int[] arr;
    int count1;
    boolean flipped;
    
    public Bitset(int size) {
        this.arr = new int[size];
        this.count1 = 0;
        this.flipped = false;
    }
    
    public void fix(int idx) {
        if ((!flipped && arr[idx] == 0) || (flipped && arr[idx] == 1)) {
            arr[idx] = flipped ? 0 : 1;
            count1++;
        }
    }
    
    public void unfix(int idx) {
        if ((!flipped && arr[idx] == 1) || (flipped && arr[idx] == 0)) {
            arr[idx] = flipped ? 1 : 0;
            count1--;
        }
    }
    
    public void flip() {
        flipped = !flipped;
        count1 = arr.length - count1;
    }
    
    public boolean all() {
        return count1 == arr.length;
    }
    
    public boolean one() {
        return count1 > 0;
    }
    
    public int count() {
        return count1;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int bit : arr) {
            sb.append(flipped ? 1 - bit : bit);
        }
        return sb.toString();
    }
}
