
public class pattern {
	
	public static void main(String args[]){
	int i,j,n=4;
	int k=1,p=1;
	
	for(i=0;i<=n;i++){
	for( k=p;k<=4;k++){
		System.out.print(" ");
		
	}
	p++;
		for(j=0;j<=2*i;j++){			
			System.out.print("*");
		}
				
		System.out.println();
	}
	
}
}
