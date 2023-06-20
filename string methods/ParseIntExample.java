import java.util.Scanner;
class ParseIntExample{
	public static void main(String [] args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string");
	String name=s.nextLine();
	int num=Integer.parseInt(name);
	float num2=Float.parseFloat(name);
	System.out.println(num); 
	System.out.println(num2); 


}
}