public class Euler7
{
	public static void main(String[] args)
	{
		final long startTime = System.nanoTime();
		int num = 1;
		int i = 3;
		while(num < 10001)
		{
			boolean isPrime = true;
			int factor = 3;
			while (factor <= Math.sqrt(i))
			{
				if(i % factor == 0)
				{
					isPrime = false;
					break;
				}
				factor+=2;
			}
			if(isPrime)
				num++;
			i+=2;
		}
		System.out.println(i-2);
		System.out.println(System.nanoTime() - startTime + " ns");
	}
}






