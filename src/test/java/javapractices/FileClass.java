package javapractices;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileClass {

	public static void main(String[] args) throws IOException {

		File file = new File("C:/Users/Admin/Desktop/testing.txt");

		// file.createNewFile();

		// file.delete();

		System.out.println(file.length());

		System.out.println(file.canRead());

		System.out.println(file.exists());

		System.out.println(file.getName());

		System.out.println(file.getPath());

		System.out.println();

		FileInputStream fileInputStream = new FileInputStream(file);

		int i = 0;
		while (i != -1) {
			i = fileInputStream.read();
			char c = (char) i;
			System.out.print(c);
		}

		fileInputStream.close();

	}

}
