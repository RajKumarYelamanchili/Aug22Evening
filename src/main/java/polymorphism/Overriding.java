package polymorphism;

class Bank
{
	
	int getRateOfInterest()
	{
		return 0;
	}
}

class SBI extends Bank
{
	int getRateOfInterest()
	{
		return 8;
	}
	
}


public class Overriding {

	public static void main(String[] args) {
		
		SBI sbi = new SBI();
		System.out.println("SBI rate of interest: " + sbi.getRateOfInterest());
		
	}

}
