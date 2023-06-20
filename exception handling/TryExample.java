public class TryExample{
	public static void methodError(){
	try{
	int c=2/0;
	System.out.println("value of c is"+c);
}catch(Exception e){
	e.printStackTrace();
}
}
	public static void main(String [] args){
	methodError();
}
}