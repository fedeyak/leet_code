package easy_problems.ep_21_merge_two_sorted_lists;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(5, new ListNode(6, new ListNode(7)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode newListNode = mergeTwoLists(list1, list2);
        printListNode(newListNode);


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

    public static void printListNode(ListNode listNode) {
        while (listNode != null) {
            System.out.print(listNode.val + "; ");
            listNode = listNode.next;
        }
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

