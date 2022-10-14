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
    public ListNode deleteMiddle(ListNode head) {
        int mid=1;
        ListNode temp=head;
        while(temp.next!=null){
            mid++;
            temp=temp.next;
        }
        if(mid==1)
            return null;
        mid=mid/2+1;
        ListNode temp2=head;
        for(int i=1;i<mid-1;i++){
            temp2=temp2.next;
        }
        temp2.next=temp2.next.next;
        return head;
    }
}