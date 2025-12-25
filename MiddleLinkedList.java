package lecture31;

public class MiddleLinkedList {

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
	ListNode head;
	ListNode tail;
	int size=0;
	
	 public ListNode middleNode(ListNode head) {
		 
		int count=0;
		ListNode temp= head;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		int n=0;
		temp= head;
		while(n<count/2) {
			temp=temp.next;
			n++;
		}
		 
		return temp;
	        
	 }

}
