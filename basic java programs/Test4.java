interface Kgm{
	void development();
	int students=5;
}

interface Kgcas{
	void bsc();
}
abstract class Kgisl{
	abstract void arts();
	abstract void engineering();

}
class Test4 extends Kgisl implements Kgm,Kgcas{
	public void development(){
	System.out.println("Kgm has started admission for development courses");
	
}
	void arts(){
	System.out.println("there are many seats avalible for arts in kgisl");
}
	void engineering(){
	System.out.println("the admission for engeneering is going in kgisl");
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