
public class ListsEqual {
	public int equal (ListNode a1, ListNode a2) {
		
		if (count(a1) == count(a2)) {
			while (a1 != null && a2 != null) {
				if (a1.info != a2.info) {
					return 0;
				}
				a1 = a1.next;
				a2 = a2.next;
			}
			return 1;
		}
		return 0;
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
