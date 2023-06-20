public class DestructorExample{
	public static void main(String [] args){
	DestructorExample ob=new DestructorExample();
	ob.finalize();

}
	protected void finalize(){
	System.out.println("constructor is destroyed by finalize method");
}
}