class One{
	public static void m1(){

	System.out.println("static method from super class");
}
	int m2(int a){
	this.m1();
	System.out.println("non static method from super class");
return 5; 
}
	 One(){
	this('a');
	System.out.println("empty parameter constructor of super class");
}
	One(char a){
	this.m2(5);
	System.out.println("parameter constructor from super class");
}
	static{
	System.out.println("static block");
}
{
	System.out.println("init block");
}
}
class Test5 extends One{
	Test5(){
	this(5.34f);
	System.out.println("empty parameter constructor in child class");
}
	Test5(float c){
	
	System.out.println("parameter constructor in child class");
}
  	public void m6(){
	
	System.out.println("non static method of child class");
}

	public int m7(){
	return 20;
}
	public static void main(String [] args){
	Test5 t=new Test5();
	int x=t.m7();
	int y=20;
	System.out.println("addition by reusability concept-"+(x+y));
	
}
}