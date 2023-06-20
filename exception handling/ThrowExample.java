public class ThrowExample{
	public void validate(int age){
	if(age<18){
	throw new ArithmeticException("thambi ne inom valaranum");
}else{
	System.out.println("else block");
	}	

}

	public static void main(String [] args){
	System.out.println("entering mainmethod");
	ThrowExample s= new ThrowExample();
	s.validate(15);
}
}