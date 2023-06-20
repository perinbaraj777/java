class KGM{
void development(){
System.out.println("hello");
}
public static KGM KGM(KGM a){

return a;
}

public static void main(String [] args){
KGM g =KGM(new KGM());

g.development();
}
	
}