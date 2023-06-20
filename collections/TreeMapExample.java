import java.util.*;
public class TreeMapExample{
	public static void main(String args []){
		// Map<String,String> obj=new TreeMap<>();
			
			//(or)							//Navigable classes is  added in the Map to access the
										//descendingMap(),headMap(),tailMap(),subMap()
			
	NavigableMap<String,String> obj=new TreeMap<>();     


		obj.put("1superstar:","rajini");
		obj.put("2little superstar:","simbu");
		obj.put("3vaigaipuyal:","vadivel");
		obj.put("4ladysuperstar:","nynethara");
		obj.put("5powerstar:"," ");
		obj.put("6captain:","vijayakanth");

	obj.replace("powerstar:"," ","senevas");




//System.out.println(obj.descendingMap());

//System.out.println(obj.headMap("4ladysuperstar:",true));	  //<------ eg:1234
//System.out.println(obj.headMap("4ladysuperstar:",false));		//eg:123	


//System.out.println(obj.tailMap("4ladysuperstar:",true));	        //------> eg:4,5,6
										//eg:5,6
//System.out.println(obj.tailMap("4ladysuperstar:",false));			



//System.out.println(obj.subMap("1superstar:",true,"6captain:",true));      	//prints the 1-6 
System.out.println(obj.subMap("1superstar:",false,"6captain:",false));		//prints from  2-5	

	

	//for(Map.Entry map:obj.entrySet()){

	//System.out.println(map.getKey());		//only prints only the key

	//System.out.println(map.getKey()+" "+map.getValue());	



//}
}
	

	
}