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
    public boolean isPalindrome(ListNode head) {
    if(head==null || head.next==null) return true;
    ListNode slow=head;
    ListNode fast=head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    ListNode p2= rev(slow);
    ListNode p1=head;
    while(p2!=null){
        if(p1.val!=p2.val){
            return false;
        }
        p1=p1.next;
        p2=p2.next;
    }
     return true;   
    }
    public ListNode rev(ListNode head){
    ListNode prev=null;
    ListNode temp=head;
    while(temp!=null){
        ListNode curr= temp.next;
        temp.next=prev;
        prev=temp;
        temp=curr;
    }
    return prev;
 }
}