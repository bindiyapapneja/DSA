package lecture31;

public class IntersectionLL {
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

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		int lenA=len(headA);
		int lenB=len(headB);
		if(lenA>lenB) {
			int extra = lenA-lenB;
			while(extra>0) {
				headA=headA.next;
				extra--;
			}
		}else {
			int extra = lenB-lenA;
			while(extra>0) {
				headB=headB.next;
				extra--;
			}
		}
		while(headA!=headB) {
			headA=headA.next;
			headB=headB.next;
		}
		
		return headB;

	}

	public int len(ListNode head) {
		int count=0;
		ListNode temp=head;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
	}

}
