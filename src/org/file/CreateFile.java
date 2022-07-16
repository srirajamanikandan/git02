package org.file;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\elcot\\Documents\\Manikandan\\raja");
		
		
		System.out.println("Mani Updated");
		
//		boolean mkdir = file.mkdir();
//		System.out.println(mkdir);
		
//		boolean mkdirs = file.mkdirs();
//		System.out.println(mkdirs);
		
//		boolean a = file.createNewFile();
//		System.out.println(a);
		
//		boolean read = file.canRead();
//		System.out.println(read);
		
//		boolean execute = file.canExecute();
//		System.out.println(execute);
		
//		String[] list = file.list();
//		
//		for (String string : list) {
//		System.out.println(string);	
//		}
		
		
		File[] files = file.listFiles();
		
		for (File file2 : files) {
			System.out.println(file2);
		}
		
		
		
		
		
		
		
		
		
	}

}
