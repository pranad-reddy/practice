public class Euler12
{
	public static void main(String[] args)
	{
		final long startTime = System.nanoTime();
		int num = 28;
		int step = 8;
		while(true)
		{
			int div = 2; 
			int max = (int)Math.sqrt(num); 
			if (max * max == num) div++;
			for(int i = 2; i < max; i++)
			{
				if(num % i == 0)
					div+=2;
			}
			if(div > 500)
			{
				System.out.println(num);
				System.out.println(System.nanoTime() - startTime + " ns");
				break;
			}
			num+=step;
			step++;
		}
	}
}






