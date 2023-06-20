public class TryExample1{
	public void errormethod(){
	try{
	int a=20/0;
	System.out.println(a);
}catch(Exception e){
	e.printStackTrace();
}finally{
	System.out.println("finally block has been executed");
}
}
	public static void main(String [] args){
	TryExample1 s=new TryExample1();
	s.errormethod();
}

}