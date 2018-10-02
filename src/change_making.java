
import java.util.Scanner;

public class change_making 
{
	static int soln,amt=0,twenty=20,ten=10,five=5,one=1,twentyRupee=0,tenRupee=0,fiveRupee=0,OneRupee=0,i;
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount");
		soln= input.nextInt();
		twentyRupee=quarter(amt);
		tenRupee=tenRupees(twentyRupee);
		fiveRupee=fiveRupees(twentyRupee,tenRupee);
		OneRupee=penny(twentyRupee,tenRupee,fiveRupee); 
		System.out.println("twentyRupee= "+twentyRupee);
		System.out.println("tenRupee= "+tenRupee);
		System.out.println("fiveRupee= "+fiveRupee);
		System.out.println("OneRupee= "+OneRupee);
	}

	public static int quarter(int amt)
	{
		while(amt<=soln)
			{
				amt=amt+twenty;
				twentyRupee ++;
			}
		if(amt>soln)
			{
				amt=amt-twenty;
				twentyRupee--;
			}
		return twentyRupee;		
	}
	public static int tenRupees(int twentyRupee)
	{
		amt=twentyRupee*twenty;
		while(amt<=soln)
			{
				amt=amt+ten;
				tenRupee ++;
			}
		if(amt>soln)
			{
				amt=amt-ten;
				tenRupee--;
			}
		return tenRupee;
	}
	public static int fiveRupees(int twentyRupee,int tenRupee)
	{
		amt=(twentyRupee*twenty)+(tenRupee*ten);
		while(amt<=soln)
			{
				amt=amt+five;
				fiveRupee ++;
			}
		if(amt>soln)
			{
				amt=amt-five;
				fiveRupee--;
			}	
		return fiveRupee;
	}
	public static int penny(int twentyRupee,int tenRupee,int fiveRupee)
	{
		amt=(twentyRupee*twenty)+(tenRupee*ten)+(fiveRupee*five);
		while(amt<=soln)
		{
			amt=amt+one;
			OneRupee ++;
		}
		if(amt>soln)
		{
			amt=amt-one;
			OneRupee--;
		}	
		return OneRupee;
	} 
}

