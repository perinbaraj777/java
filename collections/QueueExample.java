import java.util.*;
public class QueueExample{
	public static void main(String args []){
	Queue<String> obj=new PriorityQueue<>();
	obj.add("java");
	obj.add("javascript");
	obj.add("html");
	obj.add("css");

	//System.out.println(obj.peek());			//center
	//System.out.println(obj.element());			//first
	
	Iterator itr=obj.iterator();
	while(itr.hasNext()){
	System.out.println(itr.next());
}	
	
}
}