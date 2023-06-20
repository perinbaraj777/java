import java.util.*;
public class LinkedHashMapExample{
	public static void main(String args []){
		Map<String,String> obj=new LinkedHashMap<>();
			
	
						
	
		obj.put("1superstar:","rajini");
		obj.put("2little superstar:","simbu");
		obj.put("3vaigaipuyal:","vadivel");
		obj.put("4ladysuperstar:","nynethara");
		obj.put("5powerstar:"," ");
		obj.put("6captain:","vijayakanth");

	obj.replace("powerstar:"," ","senevas");






	

	for(Map.Entry map:obj.entrySet()){

	//System.out.println(map.getKey());		//only prints only the key

	System.out.println(map.getKey()+" "+map.getValue());	



}
}
	

	
}