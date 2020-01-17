import java.util.* ;

class WhileDemo
{
	public static void main (String args[]) 
	{
		int a ;
		Scanner sc = new Scanner (System.in) ;
		
		System.out.print("Enter the number " ) ;

		a = sc.nextInt() ;

		while(a%2!=0)
		{
		System.out.println("Please enter an even number " ) ;
		a = sc.nextInt() ;
		} 		
		System.out.println("Your even number is " + a ) ;

	}



}