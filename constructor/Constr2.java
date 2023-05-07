class Constr2{
	Constr2(){
		this('a');
		System.out.println("constructor with empty parameter");
}
	Constr2(char b){
		System.out.println("constructor with parameter");
}
public static void main(String [] args){
	new Constr2();
}
}