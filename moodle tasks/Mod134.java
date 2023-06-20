class Mod134{
	public static int width=20;
		static int length=10;	
		static int diagnol1=5;
		static int diagnol2=5;
	public static void area_of_rectangle(){
	System.out.println(length*width);
}
	public static void area_of_rohombus(){
	System.out.println((diagnol1*diagnol2)/2);
}
	public static void main(String [] args){
	area_of_rectangle();
	area_of_rohombus();
}
}