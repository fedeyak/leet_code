package easy_problems.ep_0021_merge_two_sorted_lists;

public class MergeTwoSortedLists {

    public static void main(String[] args) {

    }

    //Runtime 0 ms Beats 100% of users with Java
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list1 = list2;
        }
        if (list2 == null) {
            return list2 = list1;
        }

        if (list1.val < list2.val) {
            return new ListNode(list1.val, mergeTwoLists(list1.next, list2));
        }
        return new ListNode(list2.val, mergeTwoLists(list2.next, list1));
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {
    }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

