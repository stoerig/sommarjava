package sommar2015;

public class labb1_9b
{
	public static void main(String[] args)
	{
		int i;
		int acc = 0;
		for(i = 100; i > 0; i--)
		{
		 acc = i * 2 + acc;
		}
		System.out.println(acc);
	}
}
