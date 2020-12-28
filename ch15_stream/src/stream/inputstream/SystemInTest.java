package stream.inputstream;

import java.io.IOException;

public class SystemInTest {
	public static void main(String[] args) {
		
		System.out.println("알파벳 하나를 쓰고 Enter를 누르세요");
		
		int i;
		try {
			i=System.in.read();
			System.out.println();
			System.out.println((char)i);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
