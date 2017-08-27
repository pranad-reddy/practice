public class Euler14
{
	public static int max = 0;	
	public static int currNum = 0;
	public static int maxNum = 0;
	public static void main(String[] args)
	{
		
		final long startTime = System.nanoTime();
		int num = 0;
		for (long i = 3; i < 1000000; i+=2)
		{
			currNum = i;
			isEven(i, 0);
		}

		System.out.println(maxNum);
		System.out.println(System.nanoTime() - startTime + " ns");
	}

	public static void isEven(long curr, int count)
	{
		if(curr % 2 == 0)
		{
			if(curr == 2)
			{
				if(count > max) 
				{
					max = count;
					maxNum = currNum;
				}
			}
			else 
				isEven(curr/2, count+1);

		}
		else 
			isEven(curr*3+1, count+1);
	}
}






