package exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundEx {

	public static void main(String[] args)  {
		
		try {
			File file = new File("D:\\FileHandling\\abc.txt");
			FileReader fr = new FileReader(file);
			System.out.println("hi");
		}
		catch (FileNotFoundException e) {
			System.out.println("file is not there");
		}

	}

}
