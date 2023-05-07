abstract class Kgm{
	abstract void development();
	abstract void fullstack();
	void imp(){
	System.out.println("this is important program");
	
}
}
class Test3 extends Kgm{
	void development(){
	System.out.println("development is the process of creating something");
}
	void fullstack(){
	System.out.println("full stack is an good course");
}
	public static void main(String [] args){
	Test3 t = new Test3();
	t.development();
	t.fullstack();
	t.imp();
 	
}
}