class Raj{
	Raj(){
	System.out.println("raj constructor without parameter");

}
	Raj(int a){
	System.out.println("raj constructor with parameter");
}	

}
class Constr1 extends Raj{
	Constr1(){
	super(10);
	System.out.println("constr1 class");
}
public static void main(String [] args){
	new Constr1();

}	
}