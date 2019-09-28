/**
 * Remove all elements from a linked list of integers that have value val
 * Example:
 * Input:  1->2->6->3->4->5->6, val = 6
 * Output: 1->2->3->4->5
 *
 * Approach: Sentinel Node
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveLinkedListElements {
    public static void main(String[] args) {
        ListNode linkedList = new ListNode(1);
        linkedList.setNext(new ListNode(2));
        linkedList.getNext().setNext(new ListNode(3));

        RemoveLinkedListElements r = new RemoveLinkedListElements();
        ListNode result = r.removeValue(linkedList, 2);
        System.out.println(result.val);
    }

    public ListNode removeValue(ListNode head, int val){
        //Set up a Sentinel Node
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;

        ListNode prev = sentinel, curr = head;
        while (curr!=null){
            if(curr.val == val){
                prev.next = curr.next;
            }else{
                prev = curr;
            }
            curr = curr.next;
        }
        return sentinel.next;
    }

}

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getNext() {
        return next;
    }
}

