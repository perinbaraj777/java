class A{
	private String name;
	private int age;
	private char initial;
	private float height;
	public void setName(String a){
this.name=a;
}
	public String getName(){
return name;
}
	public void setAge(int b){
this.age=b;
}
	public int getAge(){
return age;
}
	public void setInitial(char c){
this.initial=c;
}
	public char getInitial(){
return initial;
}
	public void setHeight(float d){
this.height=d;
}
	public float getHeight(){
return height;
}
}
class Encap2 extends A{
public static void main(String [] args){
Encap2 t=new Encap2();
t.setName("surya");
String v=t.getName();
System.out.println(v);
t.setAge(20);
int x=t.getAge();
System.out.println(x);
t.setInitial('s');
char y=t.getInitial();
System.out.println(y);
t.setHeight(25.34f);
float n=t.getHeight();
System.out.println(n);



}
}