package sommar2015;

public class labb1_9a 
{
	public static void main(String[] args)
	{
		int integer = 10;
		int acc = 0;
		while(integer > 0)
		{
			acc = acc + integer;
			integer = integer - 2;
		}
		System.out.println(acc);
	}
	
}
