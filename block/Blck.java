class Blck{
	static{
	System.out.println("static block");
}
	{
	System.out.println("init block");
	}
public static void main(String [] args){
	new Blck();
}
}