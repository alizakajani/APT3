
public class RemoveMin {
	public ListNode remove (ListNode list) {
		
		if (list == null || list.next == null) {
			return null;
		}
		
		int min = findMin(list);
		if (list.next.next == null) {
			if (list.next.info == min) {
				return new ListNode(list.info);
			}
			else if (list.info == min) {
				return new ListNode(list.next.info);
			}
		}
		
		while(list.info == min) {
			list = list.next;
		}
		
		ListNode first = new ListNode(list.info,list.next);
		ListNode last = first;
		while(list.next != null) {
			if (list.next.info == min) {
				list.next = list.next.next;
			}
			else {
				last = new ListNode(list.next.info,null);
				last = last.next;
				list = list.next;
			}
		}
		
		return first;
		}
	
	public int findMin(ListNode list) {
		int min = list.info;
		while (list != null) {
			if (list.info < min) {
				min = list.info;
			}
			list = list.next;
		}
		return min;
	}
}
