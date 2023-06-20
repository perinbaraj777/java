class ThrowExample1{
	static void errormethod(int a){
	if(a<5){	
	throw new ArithmeticException("hello throw method");
}else{
	System.out.println("else block");
}
}
	public static void main(String [] args){
	errormethod(2);	
}
}