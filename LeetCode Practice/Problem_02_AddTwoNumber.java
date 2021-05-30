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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode ptr=l3;
        
        int carry = 0;
        while(l1!=null || l2!=null)
        {
            int val1= (l1!=null)?l1.val:0;
            int val2= (l2!=null)?l2.val:0;
            
            int sum = val1+val2+carry;
            int data = sum%10;
            carry = sum/10;
            
            ListNode n1 = new ListNode(data);
            ptr.next=n1;
            
            ptr = ptr.next;
            
            if(l1!=null) l1= l1.next;
            if(l2!=null) l2 = l2.next;
            
        }
        if(carry>0){
            ListNode n1 = new ListNode(carry);
            ptr.next=n1;
        }
        return l3.next;
    }
}