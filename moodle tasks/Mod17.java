import java.util.Scanner;
class Mod17{
	public static void main(String [] args){
	Scanner c=new Scanner(System.in);
	System.out.println("enter the number to be multiplied:");
	int a= c.nextInt();
	for(int i=1;i<=10;i++){
	int b=a*i;
	System.out.println(b);
}
}
}