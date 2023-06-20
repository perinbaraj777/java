import java.util.*;
public class LinkedlistExample{
	public static void main(String args []){
	List<String> obj=new LinkedList<>();
	obj.add("ramkumar");
	obj.add("surya");
	obj.add("subash");
	obj.add("barathi");
	obj.remove(1);
	obj.clear();
	Iterator itr=obj.iterator();
	while(itr.hasNext()){
	System.out.println(itr.next());
}
	int size=obj.size();
	System.out.println(size);
	System.out.println(obj.get(2));
	System.out.println(obj.isEmpty());
	System.out.println(obj.contains("subash"));
	
	
	
	
}
}