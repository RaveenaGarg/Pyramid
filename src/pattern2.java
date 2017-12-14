
public class pattern2 {
	public static void main(String args[]) {
		int i, j, k, n = 4, p = 1;

		for (i = n; i >= 1; i--) {
			for (j = i; j >= 1; j--) {
				System.out.print("*");
				
			}

			System.out.println();
			for( k=3;k>=1;k--){
				System.out.print(" ");
				
			}
			p--;
				
		}

	}
}
