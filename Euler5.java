public class Euler5
{
	public static void main(String[] args)
	{
		final long startTime = System.nanoTime();
		long min = (19 * 17 * 13 * 11 * 7 * 5 * 3 * 2);
		long i = min;
		while (true)
		{
			if(i % 20 == 0 && i % 18 == 0 && i % 16 == 0 && i % 12 == 0)
			{
				System.out.println(i);
				break;
			}
			i += min;
		}
		System.out.println(System.nanoTime() - startTime + " ns");
	}
}






