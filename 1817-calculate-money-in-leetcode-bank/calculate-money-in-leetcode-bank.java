class Solution {
    public int totalMoney(int n) {
        int [] money = {1,2,3,4,5,6,7};
        int ans = 0;
        int day = 0;
        for(int i=0;i<n;i++){
            if(day == 7)
            {
                 new_arr(money);
                 day = 0;
            }
           ans+=money[day];
           day++;
        }
        return ans;
    }
    public void new_arr(int [] arr){
        arr[0]++;arr[1]++;arr[2]++;arr[3]++;arr[4]++;arr[5]++;arr[6]++;
    }
}