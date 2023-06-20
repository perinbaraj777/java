import java.util.*;
public class StackExample{
	public static void main(String args []){
	Stack<String> obj=new Stack<>();
	obj.push("surya");
	obj.push("ram");

	obj.pop();			//deletes the previous object before this method
	obj.push("subash");
	obj.push("barathi");
	
	Iterator itr=obj.iterator();
	while(itr.hasNext()){
	System.out.println(itr.next());
}
}	
}