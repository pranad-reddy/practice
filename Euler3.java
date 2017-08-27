public class Euler3
{
	public static void main(String[] args)
	{
		final long startTime = System.nanoTime();
		int prime = 0;
		long num = 600851475143L;
		for(int i = 3; i <= num; i+=2)
		{
			if(num % i == 0)
			{
				boolean isPrime = true;
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
				{
					prime = i;
					num /= i;
				}
			}
		}
		System.out.println(prime);
		System.out.println(System.nanoTime() - startTime + " ns");

	}
}