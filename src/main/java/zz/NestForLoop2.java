package zz;

public class NestForLoop2
{

	public static void main(String[] args) throws InterruptedException
	{
		for (int i = 1; i <= 2; i++) 
		{
		    for (int j = 1; j <= 3; j++) 
		    {
		        System.out.println("i = " + i + ", j = " + j);
		        Thread.sleep(1000);
		    }
		    System.out.println("*****");
		}

	}

}
