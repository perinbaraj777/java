class Threedimensionalarray{
	public static void main(String [] args){
	int mat1[][][]={{3,5,5},{6,6,7},{3,6,9}};
	int mat2[][][]={{3,4,5},{5,9,3},{6,9,2}};
	int add[][][]=new int[3][3][3];
	for(i=0;i<3;i++){
	for(j=0;j<3;j++){
	for(k=0;k<3;k++){
	add[k][i][j]=mat1[k][i][j]+mat2[k][i][j];
	System.out.print(add[k][i][j]+"");

}
}
}
}
}




///wrong code