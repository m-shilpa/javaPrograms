import java.util.Scanner;
public class decimal_to_binary {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int h,n,g=0,modu[];
	System.out.print("Enter the number to convert to binary: ");
	n= scan.nextInt();
	 modu=new int[20];

		while(n>1) {
			modu[g]=n%2;
			//System.out.print(modu[g]);
			n=n/2;
			g++;
		}
		modu[g]=n;
		
		System.out.print("The binary number is ");
        
		for(h=g;h>=0;h--)
        	System.out.print(modu[h]);     
	}
}
