class Bank {
    long [] arr;
    int size;
    public Bank(long[] balance) {
        this.arr = balance;
        this.size = balance.length;
    }
    
    public boolean transfer(int account1, int account2, long money) {
        int a1 = account1-1;
        int a2 = account2-1;
        if(a1 >= size  || a2 >= size)
        {
             return false;
        }
        if(arr[a1] >= money)
        {
             arr[a1] -= money;
             arr[a2] += money;
             return true;
        }
        return false;
    }
    
    public boolean deposit(int account, long money) {
        if(account-1 >= size)
        {
             return false;
        }
        arr[account-1]+=money;
        return true;
    }
    
    public boolean withdraw(int account, long money) {
        if(account- 1 >= size)
        {
             return false;
        }
        if(arr[account-1] >= money){
           arr[account-1] -=money;
           return true;
        }
        return false;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */