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
     public static int size(ListNode head)
     {
        if(head==null)
        return 0;
        int c=0;
        ListNode tep=head;
        while(tep!=null)
        {   c++;
              tep=tep.next;
        }
        return c; 
     }
    public ListNode removeNthFromEnd(ListNode head, int n) {
ListNode temp=head;
 int size=size(head);
if(size==n)
return head.next;
       
        int k=size-n,c=0;
        //iss vale portion se mujhe mujhe 
        while(temp!=null)
        {
         k--;
         if(k==0)
         break;
         temp=temp.next;
        }
//ListNode del=temp.next;
      if (temp.next != null) {
            temp.next = temp.next.next;
        }
        return head;
    }
}