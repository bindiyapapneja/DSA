package lecture32;

public class CycleRemoval {
	public class Node{
		int val;
		Node next;
		public Node() {
			this.val =-1;
			this.next = null;
		}
		public Node(int val , Node next) {
			this.val = val;
			this.next = next;
		}
	}
	private Node head;
	private Node tail;
	private int size = 0;

	public void removeCycle() {
		Node mp = GetMeetingPoint(head);
		if(mp==null) {
			return;
		}
		Node t=head;
		while(t!=null) {
			Node m = mp;
			t=t.next;
			while(m.next!=mp) {
				if(m.next==t) {
					m.next=null;
					return;
				}
				m=m.next;
			}
		}
	}
	
	public Node GetMeetingPoint(Node head) {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow) {
				return slow;
			}
		}
		return null;
	}

}
