public class StringMethodsExample{
	public static void main(String [] args){
	String  value="batch fourtheen is toxic";

	System.out.println(value);
	System.out.println("using charAt() method:"+value.charAt(7));
	System.out.println("using concat() method:"+value.concat(",but not"));

	System.out.println("using contains():"+value.contains("toxic"));			//true
	System.out.println("using contains():"+value.contains("Toxic"));			//false

	System.out.println("using equals():"+value.equals("batch fourtheen is toxic"));    	 //true
	System.out.println("using equals():"+value.equals("  batch fourtheen is toxic  "));    //false

	System.out.println("using equalsIgnoreCase():"+value.equalsIgnoreCase("BATCH fourtheen is toxic")); 

	System.out.println("using toUpperCase():"+value.toUpperCase());
	System.out.println("using toLowerCase():"+value.toLowerCase());

	System.out.println("using length():"+value.length());
	System.out.println("using trim():"+value.trim());					//removes unwanted space in front and back
	System.out.println("using isEmpty():"+value.isEmpty());					//false
	
	System.out.println("using replace():"+value.replace("toxic","not toxic"));
	System.out.println("using substring():"+value.substring(2,7));				//prints index from 2-6 	
	System.out.println("using indexOf():"+value.indexOf("is"));				//parameteer must be passed because method is default

	System.out.println("using join():"+value.join("-",value,value));
	System.out.println("using join():"+value.join("-","value","password","email"));
	System.out.println("using join():"+value.join(" * ",value,value,value));

	System.out.println("using compareTo():"+value.compareTo("Batch fourtheen is toxic"));
	System.out.println("using compareToIgnoreCase():"+value.compareToIgnoreCase("Batch fourtheen is toxic"));
	
	
	
	System.out.println("using hashCode():"+value.hashCode());
	
	System.out.println("using lastIndexOf():"+value.lastIndexOf('i'));
	System.out.println("using lastIndexOf():"+value.lastIndexOf('c'));
	System.out.println("using lastIndexOf():"+value.lastIndexOf("is"));

 	System.out.println("using format():"+value.format("%x",20));
	System.out.println("using format():"+value.format("%d",20));





	
}
	
    
}
