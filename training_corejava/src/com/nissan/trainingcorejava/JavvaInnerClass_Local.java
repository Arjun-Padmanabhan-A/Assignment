package com.nissan.trainingcorejava;

class JavaLocalInner {
	int data = 100;
	void createLocal() {
		class LocalInner {
			void display() {
				System.out.println(data);
			}
		}
		LocalInner l = new LocalInner();
		l.display();
	}
}

public class JavvaInnerClass_Local {

	public static void main(String[] args) {
		JavaLocalInner j = new JavaLocalInner();
		j.createLocal();

	}

}
