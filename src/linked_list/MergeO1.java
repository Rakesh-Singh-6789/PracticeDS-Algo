package linked_list;


class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
	}
}


public class MergeO1 {

    public static LinkedListNode<Integer> mergeTwoList(LinkedListNode<Integer> headA, LinkedListNode<Integer> headB) {
        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        LinkedListNode<Integer> finalReturnNode=headA;
        if(headA.data>headB.data)
            finalReturnNode=headB;

        LinkedListNode<Integer> tail=finalReturnNode;
        //int i=0;
        while(true)  
        { 

            if(headA == null) 
            { 
                tail.next = headB; 
                break; 
            } 
            if(headB == null) 
            { 
                tail.next = headA; 
                break; 
            } 


            if(headA.data <= headB.data) 
            { 
                tail.next = headA; 
                headA = headA.next; 
            }  
            else
            { 
                tail.next = headB; 
                headB = headB.next; 
            } 

            /* Advance the tail */
            tail = tail.next; 
        } 
        return finalReturnNode;		



    }
    
    public static void main(String args[]){
    	
    }

}