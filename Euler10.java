public class Euler10
{
	public static void main(String[] args)
	{
		final long startTime = System.nanoTime();
		long sum = 2;
		int i = 3;
		boolean isPrime = true;
		while(i < 2000000)
		{
			isPrime = true;
			int temp = 3;
			while (temp <= Math.sqrt(i))
			{
				if(i % temp == 0)
				{
					isPrime = false;
					break;
				}
				temp+=2;
			}
			if(isPrime)
				sum += i;
			i+=2;
		}
		System.out.println(sum);
		System.out.println(System.nanoTime() - startTime + " ns");
	}
}






