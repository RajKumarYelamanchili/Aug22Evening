package polymorphism;
//polymorphism with difference in the sequence of arguments
class DisplayOverloading3
{
	void display(char c,int num)
	{
		System.out.println("I will get automation jobs by August end");
	}

	void display(int num,char c)
	{
		System.out.println("I will try to get minimum 6 offers");
	}
	
}
public class Overloading3 {

	public static void main(String[] args) {
		
		DisplayOverloading3 obj = new DisplayOverloading3();
		   obj.display(10,'h');//6 offers
		   obj.display('p', 35);//August end
		   
	
		
		}

}
