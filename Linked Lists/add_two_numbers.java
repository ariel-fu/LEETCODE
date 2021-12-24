public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    if (l1 == null || l2 == null) {
      return null;
    }

    /**
     * iterate through both of them at the same time if we run into the end of one
     * of them, we add the longer list's rest, including any carryovers
     */
    ListNode head = null;
    int carryover = 0;
    while (l1 != null || l2 != null) {
      int value1 = 0;
      int value2 = 0;
      if (l1 != null) {
        value1 = l1.val;
        l1 = l1.next;
      }
      if (l2 != null) {
        value2 = l2.val;
        l2 = l2.next;
      }

      int newValue = value1 + value2 + carryover;
      int onesPlace = newValue % 10;
      ListNode currSum = new ListNode(onesPlace);
      head = addNode(head, currSum);
      carryover = newValue / 10;

    }

    if (carryover != 0) {
      head = addNode(head, new ListNode(carryover));
    }

    // return the head of the sum linkedlist
    return head;

}
      
private ListNode addNode(ListNode head, ListNode node) {
    if (head == null) {
      head = node;
      return head;
    }
    ListNode runner = head;
    while (head.next != null) {
      head = head.next;
    }
    head.next = node;
    return runner;
}