package zeh;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundEx {

	public static void main(String[] args) {
		
		
		try {
			File fo = new File("D:\\FileHandling\\pqr.txt");
			FileReader fr = new FileReader(fo);
			System.out.println("Hi");
		} catch (FileNotFoundException e) {
			System.out.println("file does not exist");
		}

	}

}
