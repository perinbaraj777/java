import java.util.*;
public class VectorExample{
	public static void main(String args []){
	Vector<String> obj=new Vector<>();
	obj.add("thamana");
	obj.add("ninethara");
	obj.add("simren");
	obj.add("keerthisuresh");
	Iterator itr=obj.iterator();
	while(itr.hasNext()){
	System.out.println(itr.next());
}

}
}