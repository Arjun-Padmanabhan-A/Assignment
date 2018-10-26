package com.nissan.trainingcorejava;

import java.io.IOException;

class Testing1 {
	void hello() throws Exception {
		System.out.println("Parent");
	}
}

public class ExceptionMethodOverriding extends Testing1{

	@Override
	void hello() throws IOException{
		throw new IOException("123");
		//System.out.println("Overridden");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionMethodOverriding e = new ExceptionMethodOverriding();
		try {
			e.hello();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
	}

}
