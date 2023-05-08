class Ths1{
	public Ths1(){
	this(10,'a');
	System.out.println("constructor with empty parameter");
}
	public Ths1(int a){
	this();
	System.out.println("constructor with parameter");

}
	public Ths1( int c,char b){
	System.out.println("constructor with double parameter");

}
	public static void main(String [] args){
	new Ths1(10);
}
}