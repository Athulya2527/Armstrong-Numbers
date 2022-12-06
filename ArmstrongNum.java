package pkg;

public class ArmstrongNum {

	public static void main(String[] args) {
		int n = 153;
		int  r , sum= 0;
		int temp = n;
		
		while(n>0)
		{
			r = n  % 10;
			sum = sum + (r * r * r);
			n = n / 10;
			
		}
		
		if( sum == temp)
		{
			System.out.println("The number is an Armstrong Number");
		
		}
		else 
		{
			System.out.println(" The number is not an Armstrong Number ");
		}
	}

}
