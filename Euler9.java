public class Euler9
{
	public static void main(String[] args)
	{
		final long startTime = System.nanoTime();
		for(int a = 1; a < 999/3 - 1; a++)
		{
			for(int b = a + 1; b < 1000 - a - b; b++)
			{
				int c = 1000 - a - b;
				if(a*a + b*b == c*c)
				{
					System.out.println(a*b*c);
					System.out.println(System.nanoTime() - startTime + " ns");
					System.exit(0);
				}

			}
		}
		
	}
}






