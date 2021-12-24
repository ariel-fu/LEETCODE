public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if (l1 == null) {
      return l2;
    } else if (l2 == null) {
      return l1;
    } else {
      ListNode head;
      if (l1.val < l2.val) {
        // l1.val is the smaller value
        head = new ListNode(l1.val);
        // increment l1
        l1 = l1.next;
      } else {
        head = new ListNode(l2.val);
        l2 = l2.next;
      }
    
      ListNode curr = head;
      while (l1 != null || l2 != null) {
        if (l1 == null) {
          curr.next = l2;
          break;
        } else if (l2 == null) {
          curr.next = l1;
          break;
        } else {
          int val1 = l1.val;
          int val2 = l2.val;
          // find the next smallest element
          if (val1 < val2) {
            // append onto the ret list
            curr.next = new ListNode(val1);
            // increment l1
            l1 = l1.next;
          } else {
            // val2 is the smaller (or equal) value
            curr.next = new ListNode(val2);
            // increment l2
            l2 = l2.next;
          }
          curr = curr.next;
        }
      }
      return head;
    }
    
}