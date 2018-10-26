package com.nissan.trainingcorejava;

import java.io.IOException;

public class ThrowsKeyword_Test1 {

	static void master() throws IOException, ArithmeticException {
		throw new ArithmeticException("Error Occured ");
	}
	static void notMaster()  {
		try {
			master();
		}
		catch( IOException a) {
			
		}
		catch(IndexOutOfBoundsException a) {
			System.out.println("Index Out of Bound Caught");
		}
	}
	static void pureMaster() {
		try {
			notMaster();
		}
		catch( ArithmeticException a ) {
			System.out.println("Arithmetic Handled");
		}
	}
	public static void main(String[] args) {
		pureMaster();
	}
}
