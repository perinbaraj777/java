class One{
	static int a=50;
	public void m1(){
		
		System.out.println("the m1 method of class one");
}
	public void m2(){
		System.out.println("the m2 method of class one");
}
	public int m3 (int a){
return a;
}
}
class Zuper extends One{
	public void m1(){
		System.out.println(super.a);
		super.m2();
		System.out.println("the m1 method of class Zuper");

}
public static void main(String [] args){
	Zuper t=new Zuper();
	t.m1();
}
}