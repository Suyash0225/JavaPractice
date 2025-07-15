
public class arrayDay4 {
	
	public static void main(String[] args) {
		
		int a[] = new int[4];
		a[0]=10;
		a[1]=123;
		a[2]=34;
		a[3]=6;
		
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Value of array " +i+ " is "+a[i]);
		}
		
		
	
		int b[][]= new  int[3][3];
		
		b[0][0]=71;
		b[0][1]=52;
		b[0][2]=43;
		b[1][0]=54;
		b[1][1]=15;
		b[1][2]=16;
		b[2][0]=27;
		b[2][1]=98;
		b[2][2]=49;
		int min =b[0][0];
		int mincolom= 0;
		for(int i=0;i<b.length;i++) {
			
			for(int j=0;j<b[i].length;j++) {
				if(b[i][j]<min) {
					min=b[i][j];
					mincolom=j;
				}
			}
			
		}
		System.out.println(min + " is the minimum value in the array at row " + mincolom);
		
		
		
		
		
		
		
		
	}
}
