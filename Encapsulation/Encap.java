class A{
	private String username;
	private String password;
	public void setUsername(String username){
	this.username=username;	
}
	public String getUsername(){
return username;
}
	public void setPassword(String a){
	this.password=a;
}
	public String getPassword(){
return password;
}
}
class Encap extends A{
	public static void main(String [] args){
	A t=new A();
	t.setUsername("KGM");
	String y=t.getUsername();
	System.out.println(y);	
	t.setPassword("Kgm@123");
	String x=t.getPassword();
	System.out.println(x);
}
}
