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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1;
        ListNode temp1 = list1;
        int count1 = 1;
        while(count1 <= b+1)
        {
            temp1 = temp1.next;
            count1++;
        }
        int count = 1;
        while(count < a)
        {
            temp = temp.next;
            count++;
        }
        temp.next = list2;
        ListNode end = list2;
        while(end.next!=null)
        {
            end = end.next;
        }
        end.next = temp1;
        return list1;
    }
}