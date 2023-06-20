interface Kgm{
	void development();
	int students=5;
}

interface Kgcas{
	void bsc();
}
class Kgisl{
	 void arts(){
	System.out.println("method arts");
}
	void engineering(){
	System.out.println("engineering method");
}

}
class Test4 extends Kgisl implements Kgm,Kgcas{
	public void development(){
	System.out.println("Kgm has started admission for development courses");
	
}
	
	public void bsc(){
	System.out.println("the seats are filled for bsc");
}	
public static void main(String [] args){
	Test4 t=new Test4();
	t.development();
	System.out.println(students);
	t.arts();
	t.engineering();
	t.bsc();
}
}