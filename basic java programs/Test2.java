class Test2{
 	int x=20;
	static int y=30;
void m1(){
	int z=50;
System.out.println(x+z);
}
void m2(){
m3();
}
static void m3(){
Test2 a=new Test2();
a.m1();
int f=30;
System.out.println(y+f);
}
void m4(){
m2();
}
public static void main(String [] args){
Test2 b=new Test2();
b.m4();
}
}

