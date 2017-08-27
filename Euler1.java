public class Euler1
{
	public static void main(String[] args)
	{
		final long startTime = System.nanoTime();
		int sum = 0;
		/* solution 1
		for(int i = 3; i < 1000; i++)
			if(i % 3 == 0 || i % 5 == 0)
				sum += i;*/
		//much faster no coding
		sum = ((999-3)/3 + 1) * (999+3)/2 + ((995-5)/5 + 1) * (995+5)/2 - ((990-15)/15 + 1) * (990+15)/2;
		System.out.println(sum);
		System.out.println(System.nanoTime() - startTime + " ns");
	}
}
