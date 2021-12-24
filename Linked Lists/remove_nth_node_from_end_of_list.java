public ListNode removeNthFromEnd(ListNode head, int n) {
    int numFromStart = getSize(head) - n;
    ListNode ret = head;
    if (numFromStart == 0) {
      head = head.next;
      return head;
    }
    // get to the nth-1 spot from the end of the list
    for (int i = 0; i < numFromStart - 1; i++) {
      head = head.next;
      if (head == null) {
        return null;
      }
    }

    // remove the node
    if (head.next == null) {
      return null;
    }
    ListNode nextNode = head.next.next;
    head.next = nextNode;

    return ret;

}

private int getSize(ListNode head) {
    int size = 0;
    while (head != null) {
      head = head.next;
      size++;
    }
    return size;
}