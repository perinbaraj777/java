import java.util.Scanner;
class Mod119{
	public static void main(String [] args){
	Scanner s=new Scanner(System.in);
	System.out.println("input the 1st integere:");
	int a=s.nextInt();
	System.out.println("input 2nd integer:");
	int b=s.nextInt();
	float c=(a+b)/2f;
	System.out.println("the sum of two integer is:"+(a+b));
	System.out.println("the difference of two integer:"+(a-b));
	System.out.println("the product of two integer is:"+a*b);
	System.out.println("the average of two integer is:"+c);
	System.out.println("the distance of two integer is:"+(a-b));
	System.out.println("the maximum integer is:"+Math.max(a,b));
	System.out.println("the minimum integer is:"+Math.min(a,b));
}
}