package com.nissan.trainingcorejava;

import java.io.FileOutputStream;

public class FileOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream f = new FileOutputStream("D:\\Testing.txt");
			String text = "Hello World";
			f.write(text.getBytes());
			f.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
