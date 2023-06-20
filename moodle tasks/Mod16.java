import java.util.Scanner;
 class Mod16{
	public void m1(){
	Scanner s=new Scanner(System.in);
	System.out.println("enter the first number");
	int a=s.nextInt();
	System.out.println("enter the second number");
	int b=s.nextInt();
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a*b);
	System.out.println(a/b);
System.out.println(a%b);
	
}
public static void main(String [] args){
Mod16 t=new Mod16();
t.m1();
}
	
}