package polymorphism;
//polymorphism with difference in the number of arguments
class DisplayOverloading1
{
	void display(char c)
	{
		System.out.println(c);
	}

	void display(char c,int num)
	{
		System.out.println(c + "   " + num);
	}
	
}
public class Overloading1 {

	public static void main(String[] args) {
		
		DisplayOverloading1 obj = new DisplayOverloading1();
		obj.display('y',34);
		obj.display('q');
	}

}
