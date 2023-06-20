import java.util.Scanner;
public class UserinputMail{
	public static void main(String args []){
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter your mail:");
	String name=sc.nextLine();
	System.out.println(name + "@gmail.com");
	System.out.print("Enter your mobile number:");
	
	long number=sc.nextLong();
	long [] arr=new long[10];
	arr[10]=number;
	

	

	if(arr.length==10){
	System.out.println("valid mobile number");
	
	



}else{
	System.out.println("invalid mobile number");
}

	
	
}
	


}