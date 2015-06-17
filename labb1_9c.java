package sommar2015;

public class labb1_9c
{

	public static void main(String[] args)
	{
		int acc = 0;
		int start_int = 200;
		do
		{
		acc = acc + start_int;
		start_int = start_int - 2;
		}
		while(start_int > 0);
		System.out.println(acc);
	}

}
