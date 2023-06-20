public class Unboxing{
	public static void main(String [] args){
	Integer obj = new Integer(4);
	//System.out.println(obj);         //outputs 4
	int a=obj.intValue();     //(or)int a=obj;
	System.out.println(a);
	

}
}