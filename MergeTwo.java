class MergeTwo {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ans = null;
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        while(l1 != null && l2 != null){
            if (l1.val < l2.val){
                ans = insert(ans, l1.val);
                l1 = l1.next;
            }
            else{
                ans = insert(ans, l2.val);
                l2 = l2.next;
            }
        }
        while(l1 != null){
            ans = insert(ans, l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            ans = insert(ans, l2.val);
            l2 = l2.next;
        }
        return ans;
    }
    ListNode insert(ListNode head, int val){
        if(head == null)
                return new ListNode(val);
        ListNode temp = head;
        while(temp . next != null)
            temp = temp.next;
        temp . next = new ListNode(val);
        return head;
    }
};
