import java.util.Scanner;
class Mod112{
	public static void main(String [] args){
	Scanner s=new Scanner(System.in);
	System.out.println("enter the first number:");
	int a=s.nextInt();
	System.out.println("enter the second number:");
	int b=s.nextInt();
	System.out.println("enter the third number:");
	int c=s.nextInt();
	int d=(a+b+c)/3;
	System.out.println("the average of the given number is:"+d);
}
}