class Solution {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int z_count = 0;
        for (int i : amount) {
            if(i!=0)
            pq.add(i);
        }
        if(z_count == 3)
        {
             return 0;
        }
        int count = 0;
        while (!pq.isEmpty()) {
            int size = pq.size();

            if (size == 1) {
                int ele = pq.poll() - 1;
                if (ele > 0)
                    pq.add(ele);
            } else if (size == 3) {
                int left = pq.poll();
                int mid = pq.poll();
                int right = pq.poll();

                if (left > 0)
                    left--;
                if (right > 0)
                    right--;

                if (left > 0)
                    pq.add(left);
                pq.add(mid);
                if (right > 0)
                    pq.add(right);
            } else if (size >= 2) {
                int left = pq.poll();
                int right = pq.poll();

                if (left > 0)
                    left--;
                if (right > 0)
                    right--;

                if (left > 0)
                    pq.add(left);
                if (right > 0)
                    pq.add(right);
            }

            count++;
        }
        return count;
    }
}