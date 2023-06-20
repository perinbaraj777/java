import java.util.Scanner;
class Mod117{
public static void main(String [] args){
	Scanner a= new Scanner(System.in);
	System.out.println("enter the first integer:");
	int b=a.nextInt();
	System.out.println("enter the second integer:");
	int c=a.nextInt();
	if(b==c){
	System.out.println(b+"="+c);
}else{
	System.out.println(b+"!="+c);
}
	if(b<c){
	System.out.println(b+"<"+c);
}else{
	System.out.println(b+">"+c);
}
	if(b<=c){
	System.out.println(b+"<="+c);
}else{
	System.out.println(b+">"+c);
}	

}
}