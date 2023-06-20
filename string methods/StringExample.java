import java.util.Scanner;
public class StringExample {
    public static void main(String [] args){
        Scanner a=new Scanner(System.in);
        System.out.println("enter the string");
        String s=a.nextLine();
        System.out.println(s);
        System.out.println(s.length());
        System.out.println("enter the second string");
        String c=a.nextLine();
        System.out.println(c);
        System.out.println(s+c);
        String d=a.nextLine();

        int e =Integer.parseInt(d);
        System.out.println(e);


        

    }
}
