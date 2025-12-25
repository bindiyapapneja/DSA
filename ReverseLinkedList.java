package lecture31;

import java.util.Stack;

public class ReverseLinkedList {
	public class ListNode {
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

	public ListNode reverseList(ListNode head) {
		Stack<ListNode> stack = new Stack<>();
		ListNode temp=head;
		while(temp!=null) {
			stack.push(temp);
			temp=temp.next;
		}
		ListNode newHead = stack.pop();
		temp=newHead;
		while(!stack.isEmpty()) {
			temp.next=stack.pop();
			temp=temp.next;
		}
		temp.next=null;
		return newHead;

	}

}
