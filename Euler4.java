public class Euler4
{
	public static void main(String[] args)
	{
		final long startTime = System.nanoTime();
		String pal;
		int longPal = 0;
		for(int i = 999; i > 99; i--)
		{
			for(int j = i; j > 99; j--)
			{
				if(longPal > i * j)
					break;
				pal = i * j + "";
				boolean isPal = true;
				for(int a = 0; a < pal.length()/2; a++)
				{
					if(pal.charAt(a) != pal.charAt(pal.length() - a - 1))
					{
						isPal = false;
						break;
					}
					
				}
				if(isPal && i * j > longPal)
					longPal = i * j;
				// if(pal.length() % 2 !=0)
				// 	pal = pal.substring(0,pal.length()/2) + pal.substring(pal.length()/2+1,pal.length());
				// if(pal.substring(0,pal.length()/2).equals(new StringBuilder(pal.substring(pal.length()/2,pal.length())).reverse().toString()) && i * j > longPal)
				// 	longPal = i * j;
			}
		}
		System.out.println(longPal);
		System.out.println(System.nanoTime() - startTime + " ns");
		System.exit(0);
		

	}
}