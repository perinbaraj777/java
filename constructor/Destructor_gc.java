public class Destructor_gc{
	public static void main(String [] args){
	Destructor_gc ob=new Destructor_gc();
	ob=null;
	System.gc();  //used to recycle unused object
	System.out.println("gc has been called");
}
}