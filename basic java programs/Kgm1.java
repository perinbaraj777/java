abstract class Kgm1{
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
	Test t=new Test();
	t.development();
}
}