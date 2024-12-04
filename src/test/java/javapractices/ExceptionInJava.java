package javapractices;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionInJava {

	public static void main(String[] args) throws IOException {

		ExceptionInJava e = new ExceptionInJava();

		System.out.println(e.calculateParcentage(30, 20));

		File file = new File("C:/Users/Admin/Desktop/b11.txt");

		FileInputStream fis = new FileInputStream(file);

		FileReader fileReader = new FileReader(file);

		fileReader.read();
	}

	public int calculateParcentage(int a, int b) {
		int c = a / b;
		System.out.println("After devision");
		return c;
	}

}
