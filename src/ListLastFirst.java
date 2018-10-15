
public class ListLastFirst {
	public ListNode move(ListNode list) {
		if (count(list) == 0 || count(list) == 1) {
			return list;
		}

		ListNode first = list;
		while (list.next.next != null) {
			list = list.next;
		}
		
		int last = list.next.info;
		list.next = null;
		first = new ListNode(last,first);
		return first;
    }
	
	public int count (ListNode list) {
		int c = 0;
		while (list != null) {
			list = list.next;
			c += 1;
		}
    	return c;
    }
}
