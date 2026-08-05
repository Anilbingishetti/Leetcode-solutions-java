/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        List<Integer> elements = new ArrayList<>();
        ListNode dummyList = head;
        while (dummyList != null) {
            elements.add(dummyList.val);
            dummyList = dummyList.next;
        }
        int left = 0;
        int right = elements.size()-1;
        List<Integer> list =  new ArrayList<>();
        while(left <= right){
           list.add(elements.get(left));
           if(left!=right){
            list.add(elements.get(right));
           }
           left++;
           right--;
        }
        dummyList = head;
        int i = 0;
        while(dummyList!=null){
            dummyList.val = list.get(i++);
            dummyList = dummyList.next; 
        }
    }
}