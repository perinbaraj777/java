import  java.util.*;
public class DeQueueExample{
	public static void main(String args []){
	Deque<String> obj=new ArrayDeque<>();
	obj.add("hello");
	obj.add("my");
	obj.add(" ");
	obj.add("name");
	obj.add("is");
	obj.add("is");
	
	obj.add("surya");
	
			//System.out.println(obj);  		(prints in array format with square brackets)
	
	System.out.println(obj.element());
	//System.out.println(obj.peek());
	
	
	obj.remove("surya");
	//System.out.println(obj.size());
			//System.out.println(obj.get("is"));	(errror thrown because it wont allow random access)
	//Iterator itr=obj.iterator();
	//while(itr.hasNext()){			//Iterator will iterate and display the array element of array in new lines
	//System.out.println(itr.next());
//}
}
}	