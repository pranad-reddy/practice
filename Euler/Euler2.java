public class Euler2
{
	public static void main(String[] args)
	{
		final long startTime = System.nanoTime();
		int prev = 1;
		int sum = 0;
		for(int i = 2; i < 4000000;)
		{
			if(i % 2 == 0)
				sum += i;
			i += prev;
			prev = i - prev;
		}
		System.out.println(sum);
		System.out.println(System.nanoTime() - startTime + " ns");
	}
}