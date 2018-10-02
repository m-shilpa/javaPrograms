import java.util.Scanner;

public class CRC {
	public static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CRC crc = new CRC();
		String copy,rec,code,zero="0000000000000000";
		System.out.println("Enter the dataword to be sent");
		code = sc.nextLine();
		n = code.length();
		System.out.println("n= "+n);
		copy = code;
		code += zero;
		System.out.println("s = code = "+code);
		code = crc.divide(code);
		System.out.println("code (the returned value) = "+code);
		System.out.println("Dataword = "+copy);
		copy = copy.substring(0,n) + code.substring(n);
		System.out.print("CRC = ");
		System.out.println(code.substring(n));
		System.out.println("Transmitted string = "+copy);
		System.out.println("Enter the recieved data ");
		rec = sc.nextLine();
		if(zero.equals(crc.divide(rec).substring(n)))
			System.out.println("Correct bits recieved");
		else
			System.out.println("Recieved data has errors");
		sc.close();
		
	}
    public String divide(String s) {
    	String div = "10001000000100001";
    	int i,j;
    	char x;
    	for(i=0;i<n;i++) {
    		x = s.charAt(i);
    		//System.out.println(x);
    		for(j=0;j<17;j++) {
    			if(x=='1') {
    				if(s.charAt(i+j) != div.charAt(j)) {
    					System.out.print(" i= "+i+" j= "+j+" x= "+x+" s.charAt(i+j) = "+s.charAt(i+j)+" div.charAt(j) = "+div.charAt(j));
    					s = s.substring(0,i+j) + "1" + s.substring(i+j+1);
    					System.out.println(" s.substring(0,i+j) = " +s.substring(0,i+j)+" s.substring(i+j+1) = "+s.substring(i+j+1)+" s1 = " +s);
    				}
    				else
    					{ 
    					System.out.print(" i= "+i+" j= "+j+" x= "+x+" s.charAt(i+j) = "+s.charAt(i+j)+" div.charAt(j) = "+div.charAt(j));
    					s = s.substring(0,i+j) + "0" + s.substring(i+j+1);
    					System.out.println(" s.substring(0,i+j) = " +s.substring(0,i+j)+" s.substring(i+j+1) = "+s.substring(i+j+1)+" s2 = " +s);
    					}
    			}
    		}
    	}
    	return s;
    }
	

}
