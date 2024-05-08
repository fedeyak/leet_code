package easy_problems.ep_21_merge_two_sorted_lists;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode newList = new ListNode(0);
        System.out.println(newList.next == null);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        if (list1.next == null && list1.val == 0)
        ListNode newList = new ListNode();
//        while (list1.next != null) {
//            if
//        }
//        return null;

    }
}

  class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
