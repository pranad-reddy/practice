import java.util.HashMap;
import java.util.Map;
public class Euler17
{
	public static void main(String[] args)
	{
		
		final long startTime = System.nanoTime();
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		int sum = 0;
		map.put(0,0);
		map.put(1,3);
		map.put(2,3);
		map.put(3,5);
		map.put(4,4);
		map.put(5,4);
		map.put(6,3);
		map.put(7,5);
		map.put(8,5);
		map.put(9,4);
		map.put(10,3);
		map.put(11,6);
		map.put(12,6);
		map.put(13,8);
		map.put(14,8);
		map.put(15,7);
		map.put(16,7);
		map.put(17,9);
		map.put(18,8);
		map.put(19,8);
		map.put(20,6);
		map.put(30,6);
		map.put(40,5);
		map.put(50,5);
		map.put(60,5);
		map.put(70,7);
		map.put(80,6);
		map.put(90,6);
		map.put(100,10);
		map.put(200,10);
		map.put(300,12);
		map.put(400,11);
		map.put(500,11);
		map.put(600,10);
		map.put(700,12);
		map.put(800,12);
		map.put(900,11);

		for(int i = 1; i <= 20; i++)
			sum+= map.get(i);
		int count = 1;
		for(int i = 21; i <= 100; i++)
		{
			sum += map.get(i - count % 10) + map.get(count % 10);
			count++;
		}
		count = 1;
		for(int i = 101; i < 1000; i++)
		{
			sum += 3 + map.get(i - count % 100);
			if(count % 100 > 10 && count % 100 < 20)	
				sum += map.get(count % 100);
			else sum += map.get((count % 100) - (count % 100) % 10) + map.get((count % 100) % 10);
			count++;
		}		
		sum += 11;
		sum -= 8 * 3;
		System.out.println(sum);
		System.out.println(System.nanoTime() - startTime + " ns");
	}
	

}






