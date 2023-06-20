import java.util.*;
public class ArrayListExample{
	public static void main(String [] args){
	//ArrayList<String> obj=new ArrayList<>();    //creating obj for  collection
			//(or)
	List<String> obj=new ArrayList<>();           //this method is used to because we can itself for linkedList also by simply
							// replacing the ArrayList in the above type

	obj.add("Ramkumar");
	obj.add("surya");
	obj.add("");
	obj.add("subash");
	obj.add("subash");
	obj.add("barathi");

	obj.remove(4); 				//for removing the fourth index object

	//obj.clear();				//for clearing all the objects


	Iterator itr=obj.iterator();     //inbuilt interface for looping 
	while(itr.hasNext()){
	System.out.println(itr.next());
}
	int size=obj.size();      //method of getting size
	System.out.println(size);
	System.out.println(obj.get(3));		//for getting  the first index object

	System.out.println(obj.contains("ramkumar"));

	System.out.println(obj.isEmpty());

	
	

}
}	