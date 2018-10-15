
public class ListStretch {
	public ListNode stretch (ListNode list, int amount){
        if (list == null) {
        	return null;
        }
        
        ListNode first = list;
        while (list != null) {
        	ListNode next = list.next;
        	for (int i = 1; i < amount; i +=1) {
        		list.next = new ListNode(list.info,list.next);
        		list = list.next;
        	}
        	list = next;
        }
		return first;
    }
}
