public class Euler6
{
	public static void main(String[] args)
	{
		final long startTime = System.nanoTime();
		
		int diff = 0;
		for(int i = 1; i < 101; i++)
		{
			diff -= i * i;
		}
		diff += (double)((1+100)/2)*100 * (double)((1+100)/2)*100;

		System.out.println(diff);

		System.out.println(System.nanoTime() - startTime + " ns");
	}
}






