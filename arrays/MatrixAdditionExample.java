public class MatrixAdditionExample{  
public static void main(String args[]){  
   
int a[][]={{3,4},{5,6}};    
int b[][]={{3,4},{5,6}};       
int c[][]=new int[2][2];   
for(int i=0;i<2;i++){    
for(int j=0;j<2;j++){    
c[i][j]=a[i][j]+b[i][j];   
System.out.print(c[i][j]+" ");    
}
System.out.println();    
        
}
}
}  