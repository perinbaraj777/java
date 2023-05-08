class A{
	A(){
	System.out.println("class a empty parameter constructor");
}
}
class Spr1 extends A{
	Spr1(int a){
	this('h');
	System.out.println("child class with parameter");
}
	Spr1(char b){
	super();
	System.out.println("child class with char returntype");

}
public static void main(String [] args){
	new Spr1(5);
}
}