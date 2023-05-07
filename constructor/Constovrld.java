class Constovrld{
	Constovrld(){
		System.out.println("the first constructor");
	
}
	Constovrld(int a){
		System.out.println("the second  constructor with the parameter");
}
public static void main(String [] args){
	new Constovrld(10);
	new Constovrld();
}
}